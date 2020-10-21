package il.study.spring.math_exercise_generation.levels;

import il.study.spring.math_exercise_generation.*;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class FirstLevelGeneration implements CreateExerciseService {

    private RandomNumberGenerator generator = new RandomNumberGenerator(0, 10);

    private List<Operation> operations = new ArrayList<>(EnumSet.allOf(Operation.class));
    public List<Operation> getOperations() {
        return operations;
    }
    Operation randomOperation = operations.get(RandomNumberGenerator.randomNumber(0, 3));



    @Override
    public Exercise create() {
        Exercise exercise = generator.createValues();
        exercise.setOperation(randomOperation);
        exercise.setAnswer(HelperUtilCalculator.calculate(exercise.getA(), exercise.getB(), randomOperation));
        return exercise;
    }


}
