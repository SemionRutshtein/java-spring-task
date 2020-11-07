package il.study.spring.real_spring.profiles_example;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;


@Configuration
@ComponentScan
@EnableScheduling
public class ConfigurationService {
    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "dev");
        new AnnotationConfigApplicationContext(ConfigurationService.class);
    }
}
