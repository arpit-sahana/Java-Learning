package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a * b;
        BiFunction<Integer, Integer, List<Integer>> biFunction3 = (a, b) -> Arrays.asList(a, b);
        System.out.println("BiFunction example 1: " + biFunction3.apply(10,2));
        Function<Integer, List<Integer>> biFunction4 = Arrays::asList;
        System.out.println(biFunction.andThen(biFunction4).apply(10,2));
    }
}
