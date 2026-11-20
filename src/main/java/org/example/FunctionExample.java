package org.example;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> function1 = String::length;
        System.out.println(function1.apply("Hello"));
        Function<String, Integer> function2 = function1.andThen(a -> a * 2);
        System.out.println(function2.apply("Hello"));
        Function<Integer, Integer> function3 = a -> a * 2;
        Function<Integer, Integer> function4 = a -> a * 3;
        Function<Integer, Integer> function5 = function3.compose(function4);
        System.out.println("Function Test::::"  + function5.apply(1));
    }
}
