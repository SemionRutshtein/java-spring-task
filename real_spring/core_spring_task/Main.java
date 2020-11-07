package il.study.spring.real_spring.core_spring_task;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Config.class);
    }
}
