package il.study.spring.my_spring.object_factory;

import lombok.SneakyThrows;

import java.lang.reflect.InvocationTargetException;

public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();
    private Config config = new JavaConfig();


    public static ObjectFactory getInstance() {
        return ourInstance;
    }

    private ObjectFactory() {

    }
    @SneakyThrows
    public <T> T createObject(Class <T> type) {
        if (type.isInterface()) {
            type = config.getImplClass(type);
        }
        T t = type.getDeclaredConstructor().newInstance();

        return t;
    }


}
