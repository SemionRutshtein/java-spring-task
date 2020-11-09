package il.study.spring.real_spring.more_aop;

import il.study.spring.real_spring.more_aop.business.SomeService;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
@ImportResource("classpath:aop.xml")
@PropertySource("classpath:mail.properties")
@EnableAspectJAutoProxy
public class SomeConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SomeConfig.class);
        SomeService someService = context.getBean(SomeService.class);

        try {
            someService.work();
        } catch (Exception e) {
            System.out.println("You have some problem. Now we working to fixed this one");
        }


    }
}
