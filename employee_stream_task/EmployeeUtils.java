package il.study.spring.employee_stream_task;

import java.util.List;

public class EmployeeUtils {
    public static int getSalarySum(List<Employee> employees) {
         return employees.stream()
                 .mapToInt(Employee::getSalary)
                 .sum();
    }
}
