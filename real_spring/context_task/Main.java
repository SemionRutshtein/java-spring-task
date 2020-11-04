package il.study.spring.real_spring.context_task;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");        context.getBean(ShakespeareQuoter.class).sayQuote();

    }
}
