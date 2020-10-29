package il.study.spring.real_spring.context_task;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class TerminatorQuoter implements Quoter {
    private List<String> messages = new ArrayList<>();
    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }
}
