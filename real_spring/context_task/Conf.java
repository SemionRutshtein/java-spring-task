package il.study.spring.real_spring.context_task;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;


@Configuration
@ComponentScan
@EnableAspectJAutoProxy
@PropertySource("classpath:application.properties")
public class Conf {


//    @Bean
//    public static PropertySourcesPlaceholderConfigurer configurer () {
//        return new PropertySourcesPlaceholderConfigurer();
//    }
//    @Value("${shake}")
//    private String name;
//
//
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer configurer () {
//        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
//        configurer.setIgnoreResourceNotFound(false);
//        configurer.setFileEncoding("UTF");
//        return configurer;
//    }
}
