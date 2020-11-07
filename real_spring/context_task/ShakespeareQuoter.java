package il.study.spring.real_spring.context_task;

import il.study.spring.my_spring.object_factory.InjectRandomInt;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

    @Component
    @Book
    public class ShakespeareQuoter implements Quoter {

    @InjectRandomInt(min = 3, max = 5)
    private int repeat;

    @Value("To eat or not to eat")
     private String message;


        @Override
    public void sayQuote() {
            for (int i = 0; i < repeat; i++) {
                System.out.println(message);
            }
        }
}
