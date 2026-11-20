package org.example;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceByObject {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Test", 25, 1998);
        Employee e2 = new Employee(2, "Arpit", 29, 1998);
        Employee e3 = new Employee(3, "Alpesh", 38, 1986);
        List<Employee> employees = Arrays.asList(e1, e2, e3);
        System.out.println("Without Sorting::::" + employees);
        SortingProvider sortingProvider = new SortingProvider();
        employees.sort(sortingProvider::compareByName);
        System.out.println("With Sorting::::" + employees);
    }
}
