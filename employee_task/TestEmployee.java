package il.study.spring.employee_task;

import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

public class TestEmployee {
    public static void main(String[] args) {
        List<Employee> employees = asList (
                Employee.builder().name("First").salary(5000).build(),
                Employee.builder().name("Second").salary(10000).build(),
                Employee.builder().name("Third").salary(15000).build()
        );

        Map<String, Integer> map = EmployeeService.groupByNameAndSalary(employees);
        System.out.println(map);
    }

}
