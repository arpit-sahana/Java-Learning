package org.example;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Employee> employeeSupplier = () -> new Employee(1, "Arpit", 29, 2019);
        Supplier<Integer> randomSupplier = () -> new Random().nextInt(20);
        Stream.generate(randomSupplier).limit(10).forEach(System.out::println);
        System.out.println("Employee Supplier: " + employeeSupplier.get());
    }
}
