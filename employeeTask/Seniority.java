package il.study.spring.employeeTask;

import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@RequiredArgsConstructor
public enum Seniority {
    JUNIOR(1000, 10000), MIDDLE(10001, 15000), SENIOR(15001, 40000);
    private final int min;
    private final int max;


    public static Seniority sortBySalary(int salary) {
        return Arrays.stream(values())
                .filter(seniority -> (seniority.min <= salary) && (seniority.max >= salary))
                .findAny()
                .get();

    }
}