package il.study.spring.my_spring.object_factory;

public interface Config {
   <T> Class <T> getImplClass(Class<T> type);
}
