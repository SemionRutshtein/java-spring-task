package il.study.spring.my_spring.object_factory;
import java.util.HashMap;
import java.util.Map;


public class JavaConfig implements Config {
    private Map<Class,Class> ifc2ImpClass;

    public JavaConfig(){
        ifc2ImpClass = new HashMap<>();
        ifc2ImpClass.put(Cleaner.class, CleanerImpl.class);
        ifc2ImpClass.put(Speaker.class, ConsoleSpeaker.class);
    }

    @Override
    public <T> Class<T> getImplClass(Class<T> type) {
        return ifc2ImpClass.get(type);
    }
}