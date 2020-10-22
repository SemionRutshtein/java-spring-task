package il.study.spring.my_spring.object_factory;

import lombok.SneakyThrows;

import java.util.HashMap;
import java.util.Map;

public class JavaConfig implements Config {

    private Map<Class, Class> ifc2ImplClass = new HashMap<>();

    public JavaConfig() {
        ifc2ImplClass.put(Speaker.class, ConsoleSpeaker.class);
        ifc2ImplClass.put(Cleaner.class, CleanerImpl.class);
    }


    @Override
    public <T> Class <T> getImplClass(Class<T> type) {

        return ifc2ImplClass.get(type);
    }
}
