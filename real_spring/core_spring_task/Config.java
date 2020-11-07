package il.study.spring.real_spring.core_spring_task;


import il.study.spring.real_spring.core_spring_task.mails.MailGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;

@Configuration
@ComponentScan
@EnableScheduling
public class Config {

    @Bean
    public Map<Integer, MailGenerator> map(@Autowired List<MailGenerator> generators) {
       return generators.stream().collect(toMap(MailGenerator::mailCode, Function.identity()));
    }
}
