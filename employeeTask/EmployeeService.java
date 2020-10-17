package il.study.spring.employeeTask;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingInt;

public class EmployeeService {

    public static Map<String, Integer> groupByNameAndSalary (List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.toMap(Employee::getName, Employee::getSalary));
    }

    public static Map<Seniority, List<Employee>> groupBySeniority (List<Employee> employees) {
        return employees.stream().collect(
                Collectors.groupingBy(employee -> Seniority.sortBySalary(employee.getSalary()))
        );
    }

    public static List<String> getNames(List<Employee> employees) {
        return employees.stream()
                .map(Employee::getName)
                .sorted(comparingInt(String::length))
                .collect(Collectors.toList());
    }

}
