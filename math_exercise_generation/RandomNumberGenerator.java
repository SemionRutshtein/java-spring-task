package il.study.spring.math_exercise_generation;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RandomNumberGenerator {

   private int min;
   private int max;

   public Exercise createValues() {
       return Exercise
               .builder()
               .a(randomNumber(min, max))
               .b(randomNumber(min, max))
               .build();
   }

    public static int randomNumber(int min, int max) {
        return min + (int) (Math.random()*max);
    };

}
