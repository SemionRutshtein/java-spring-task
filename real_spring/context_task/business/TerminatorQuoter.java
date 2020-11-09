package il.study.spring.real_spring.context_task.business;

import il.study.spring.my_spring.object_factory.Benchmark;
import il.study.spring.real_spring.context_task.Film;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Benchmark
@Film
public class TerminatorQuoter implements Quoter {

    private List<String> messages;


    @Value("${terminator}")
    public void setMessages(String[] messages, @Value("${tri}") String javaHome) {
        System.out.println("javaHome " + javaHome);
        this.messages = new ArrayList<>(Arrays.asList(messages));
    }

    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }

    @PreDestroy
    public void killAll () {
        new Thread(()-> System.out.println("You are terminated")).start();
    }
}
