package il.study.spring.real_spring.context_task;

import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
public @interface DeprecatedClass {
    Class<?> newClass();
}
