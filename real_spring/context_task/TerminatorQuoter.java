package il.study.spring.real_spring.context_task;

import il.study.spring.my_spring.object_factory.Benchmark;
import lombok.Data;
import org.springframework.scheduling.annotation.Async;

import java.util.ArrayList;
import java.util.List;
@Data
@Benchmark
@DeprecatedClass(newClass = T1000.class)
public class TerminatorQuoter implements Quoter {
    private List<String> messages = new ArrayList<>();
    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }

    @Async
    public void killAll () {
        new Thread(()-> System.out.println("You are terminated")).start();
    }
}
