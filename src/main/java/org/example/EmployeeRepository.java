package org.example;

import java.util.List;
import java.util.function.Predicate;

public class EmployeeRepository {

    static List<Employee> filterEmployee(List<Employee> employees, Predicate<Employee> predicate) {
        return employees.stream().filter(predicate).toList();
    };
}
