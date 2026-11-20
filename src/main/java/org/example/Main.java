package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FunctionalInterfaceEx functionalInterface = (a, b) -> System.out.println(String.valueOf(a + b));
        functionalInterface.sum(1, 2);
        Employee e1 = new Employee(1, "Arpit", 29, 2019);
        Employee e2 = new Employee(2, "Sunil", 29, 2019);
        Employee e3 = new Employee(3, "Alpesh", 38, 2022);
        Employee e4 = new Employee(4, "Gaurang", 32, 2017);
        List<Employee> employees = Arrays.asList(e1, e2, e3, e4);
        List<Employee> result = EmployeeRepository.filterEmployee(employees, employee -> employee.getId() == 1);
        List<Employee> result2 = EmployeeRepository.filterEmployee(employees, joiningYearPredicate(2022));
        System.out.println("Employees:"+result2);
    }

    public static Predicate<Employee> joiningYearPredicate(int joiningYear) {
    return employee -> employee.getJoiningYear() == joiningYear;
    }
}