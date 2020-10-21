package il.study.spring.math_exercise_generation;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Exercise {

    private double a;
    private double b;
    private double answer;
    Operation operation;

    @Override
    public String toString() {
        return a+ " " + operation.getOperation() + " " + b + " = " + answer;
    }
}
