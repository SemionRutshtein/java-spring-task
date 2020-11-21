package il.study.spring.intrview;


import org.springframework.beans.factory.annotation.Autowired;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Autowired
public @interface InjectList {
    Class<?> [] value();
}
