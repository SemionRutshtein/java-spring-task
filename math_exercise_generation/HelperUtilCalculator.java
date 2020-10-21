package il.study.spring.math_exercise_generation;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HelperUtilCalculator {

    public static double calculate(double a, double b, Operation randomOperation) {
        if (randomOperation == Operation.PLUS){
            return a + b;
        }
        else if (randomOperation == Operation.MINUS){
            return a - b;
        }
        else if (randomOperation == Operation.MULTIPLE){
            return a * b;
        }
        else  if (randomOperation == Operation.DIVIDED && b != 0) {
            return a / b;
        }
        return 0;

    }
}
