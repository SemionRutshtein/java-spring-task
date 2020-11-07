package il.study.spring.real_spring.refresh_singleton_prototype;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import lombok.SneakyThrows;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.concurrent.TimeUnit;

public class TwoSecondsScopeProvider implements Scope {
    private Cache<String, Object> cache =
            CacheBuilder.newBuilder().expireAfterWrite(2, TimeUnit.SECONDS).build();

    @Override
    @SneakyThrows
    public Object get(String name , ObjectFactory<?> objectFactory) {

       return cache.get(name, objectFactory::getObject);

    }

    @Override
    public Object remove(String s) {
        return null;
    }

    @Override
    public void registerDestructionCallback(String s, Runnable runnable) {

    }

    @Override
    public Object resolveContextualObject(String s) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}
