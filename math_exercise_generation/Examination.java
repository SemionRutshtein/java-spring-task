package il.study.spring.math_exercise_generation;

import il.study.spring.math_exercise_generation.levels.FirstLevelGeneration;
import il.study.spring.math_exercise_generation.levels.SecondLevelGeneration;

import java.util.ArrayList;
import java.util.List;


public class Examination {

    List<CreateExerciseService> generators = List.of(
            new FirstLevelGeneration(),
            new SecondLevelGeneration()
    );

    public List<Exercise> getExercises(int amount) {

        ArrayList<Exercise> exercises = new ArrayList<>();

        for (int i = 0; i< amount; i++){
            int randomNum = RandomNumberGenerator.randomNumber(0, generators.size());
            Exercise exercise = generators.get(randomNum).create();
            exercises.add(exercise);
        }

        return exercises;
    }
}
