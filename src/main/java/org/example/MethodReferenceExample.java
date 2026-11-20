package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReferenceExample {

    public static int compareByName (Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }

    public static int compareByAge (Employee e1, Employee e2) {
        return e1.getAge() - e2.getAge();
    }

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Test", 25, 1998);
        Employee e2 = new Employee(2, "Arpit", 29, 1998);
        Employee e3 = new Employee(3, "Alpesh", 38, 1986);
        List<Employee> employees = Arrays.asList(e1, e2, e3);
        employees.sort(MethodReferenceExample::compareByAge);
        System.out.println("Comparing employees by age:" + employees);
    }
}
