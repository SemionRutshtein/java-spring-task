package il.study.spring.intrview;

import org.springframework.stereotype.Component;

@Component
public class MyValidator3 implements Validator {
    @Override
    public void validate() {
        System.out.println("my validator 3");
    }
}
