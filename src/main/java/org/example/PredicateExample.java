package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6,7,8,9, 10, 11, 12, 13, 14, 15);
        List<String> arrayNames = Arrays.asList("Rado", "Renevue", "Gilly", "Test");
        List<Integer> predicateResult1 = list.stream().filter(x-> x > 5).toList();
        System.out.println("Predicate 1 Result::" + predicateResult1);
        Predicate<Integer> predicate1 = x -> x >= 5;
        Predicate<Integer> predicate2 = x -> x < 15;
        List<Integer> predicateResult2 = list.stream().filter(predicate1.negate()).toList();
        System.out.println("Predicate 2 Result::" + predicateResult2);
        List<Integer> predicateResult3 = list.stream().filter(predicate1.and(predicate2)).toList();
        System.out.println("Predicate 3 Result::" + predicateResult3);
        Predicate<String> predicate3 = x -> x.length() <= 5;
        System.out.println("Predicate String Result::" +StringProcessor.filter(arrayNames, predicate3.negate()));
        Predicate<String> predicate4 = x -> x.startsWith("R");
        Predicate<String> predicate5 = x -> x.startsWith("G");
        boolean result1 = predicate4.or(predicate5).test("SRado");
        System.out.println("Predicate 5 Result::" + result1);
    }
}
