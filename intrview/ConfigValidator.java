package il.study.spring.intrview;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@ComponentScan
@Configuration
public class ConfigValidator {

    //Нужно реализовать вот эту логику ЧТо бы моя анотация инжектила те бины что я указал и протестить
    @InjectList({MyValidator3.class, MyValidator2.class})
    private List<Validator> validators;





}
