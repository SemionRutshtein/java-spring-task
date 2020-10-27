package il.study.spring.my_spring.object_factory;

public interface ProxyConfigurator {
    <T> Object wrapWithProxy(Object t, Class<T> type);
}
