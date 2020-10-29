package il.study.spring.real_spring.context_task;

import lombok.Data;

    @Data
    public class ShakespeareQuoter implements Quoter {

     private String message;


        @Override
    public void sayQuote() {
        System.out.println(message);
    }
}
