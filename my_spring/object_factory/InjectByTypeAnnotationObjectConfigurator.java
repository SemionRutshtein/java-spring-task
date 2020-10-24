package il.study.spring.my_spring.object_factory;

import lombok.SneakyThrows;
import org.reflections.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Set;

public class InjectByTypeAnnotationObjectConfigurator implements ObjectConfigurator {
    @SneakyThrows
    @Override
    public void configure(Object t) {
        Class<?> type = t.getClass();
        Set<Field> fields = ReflectionUtils.getAllFields(type, field -> field.isAnnotationPresent(InjectByType.class));
        for (Field field : fields) {
            Class<?> fieldType = field.getType();
            Object object = ObjectFactory.getInstance().createObject(fieldType);
            field.setAccessible(true);
            field.set(t,object);
        }
    }
}
