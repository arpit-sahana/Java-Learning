package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Test", 25, 1998));
        employees.add(new Employee(2, "Arpit", 29, 1998));
        employees.add(new Employee(3, "Test", 25, 1998));
        employees.add(new Employee(4, "Alpesh", 38, 1986));
        employees.add(new Employee(5, "Test", 25, 2003));
        List<String> employeeNames =  employees.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }).map(Employee::getName).toList();
        System.out.println("Employee names::: " + employeeNames);
    }
}
