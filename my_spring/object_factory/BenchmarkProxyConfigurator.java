package il.study.spring.my_spring.object_factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class BenchmarkProxyConfigurator implements ProxyConfigurator {
    @Override
    public <T> Object wrapWithProxy(Object t, Class<T> type) {
        if (type.isAnnotationPresent(Benchmark.class) || Arrays.stream(type.getMethods()).anyMatch(method -> method.isAnnotationPresent(Benchmark.class))){
            return (T) Proxy.newProxyInstance(type.getClassLoader(), type.getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                    Method classMethod = type.getMethod(method.getName(), method.getParameterTypes());
                    if (type.isAnnotationPresent(Benchmark.class) || classMethod.isAnnotationPresent(Benchmark.class)) {
                        System.out.println("*****Benchmark for method " + method.getName() + " started");
                        long start = System.nanoTime();
                        Object retVal = method.invoke(t, args);
                        long end = System.nanoTime();
                        System.out.println(end - start);
                        System.out.println("*****Benchmark for method " + method.getName() + " finished");
                        return retVal;
                    } else {
                        return method.invoke(t, args);
                    }
                }
            });
        }

        return t;
    }
}

