package il.study.spring.my_spring.object_factory;

import lombok.SneakyThrows;
import org.reflections.ReflectionUtils;
import org.reflections.Reflections;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ObjectFactory {
    Reflections scanner = new Reflections("il.study.spring.my_spring.object_factory");
    private static ObjectFactory ourInstance = new ObjectFactory();
    private Config config = new JavaConfig();
    private List<ObjectConfigurator> configurators = new ArrayList<>();
    private List<ProxyConfigurator> proxyConfigurators = new ArrayList<>();

    public static ObjectFactory getInstance() {
        return ourInstance;
    }

    @SneakyThrows
    private ObjectFactory() {
        Set<Class<? extends ObjectConfigurator>> classes = scanner.getSubTypesOf(ObjectConfigurator.class);
        for (Class<? extends ObjectConfigurator> aClass : classes) {
            configurators.add(aClass.getDeclaredConstructor().newInstance());
        }
        Set<Class<? extends ProxyConfigurator>> set = scanner.getSubTypesOf(ProxyConfigurator.class);
        for (Class<? extends ProxyConfigurator> aClass : set) {
            proxyConfigurators.add(aClass.getDeclaredConstructor().newInstance());
        }
    }


    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        type = resolveImpl(type);
        T t = create(type);
        configure(t);
        invokeInit(t);
        t = wrapWithProxyIfNeeded(type, t);

        return t;
    }

    private <T> T wrapWithProxyIfNeeded(Class<T> type, T t) {
        for (ProxyConfigurator proxyConfigurator : proxyConfigurators) {
            t = (T) proxyConfigurator.wrapWithProxy(t, type);
        }
        return t;
    }

    @SneakyThrows
    private <T> void invokeInit(T t){
        Class<?> type = t.getClass();
        Set<Method> initMethods = ReflectionUtils.getAllMethods(type, method -> method.isAnnotationPresent(InjectByType.class));
        for (Method initMethod : initMethods) {
            initMethod.invoke(t);
        }
    }

    private <T> void configure(T t) {
        configurators.forEach(configurator -> configurator.configure(t));
    }

    @SneakyThrows
    private <T> T create(Class<T> type) {
        T t = type.getDeclaredConstructor().newInstance();
        return t;
    }

    private <T> Class<T> resolveImpl(Class<T> type) {
        if (type.isInterface()) {
            Class<T> implClass = config.getImplClass(type);
            if (implClass == null) {
                Set<Class<? extends T>> classes = scanner.getSubTypesOf(type);
                if (classes.size() != 1) {
                    throw new RuntimeException("0 or more than onr impl of" + type + " was found, please update your config");
                }
                type = (Class<T>) classes.iterator().next();
            }
        } else {
            type = config.getImplClass(type);
        }
        return type;
    }
}