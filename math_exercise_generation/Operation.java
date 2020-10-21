package il.study.spring.math_exercise_generation;

import lombok.AllArgsConstructor;

public enum Operation {
        PLUS ("+"),
        MINUS("-"),
        MULTIPLE("*"),
        DIVIDED("/");

    private final String operation;

    Operation(String operation) {
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }
}
