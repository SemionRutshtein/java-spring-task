package il.study.spring.math_exercise_generation;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Examination examination = new Examination();
        List<Exercise> e = examination.getExercises(100);
        e.forEach(System.out::println);
    }
}
