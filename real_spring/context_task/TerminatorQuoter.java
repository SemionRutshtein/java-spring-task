package il.study.spring.real_spring.context_task;

import il.study.spring.my_spring.object_factory.Benchmark;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;

@Benchmark
@Component
public class TerminatorQuoter implements Quoter {

    private List<String> messages;


    @Value("Some text")
    public void setMessages(String[] messages) {
        this.messages = Arrays.asList(messages);
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
