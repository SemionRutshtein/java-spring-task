package il.study.spring.animal_casting;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Cat implements Animal {
    @Override
    public void makeVoice() {
        System.out.println("meow-meow");
    }
}