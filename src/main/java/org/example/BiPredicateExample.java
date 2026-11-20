package org.example;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        BiPredicate<Integer, String> predicate1 = (n, v)-> {
            return n == Integer.parseInt(v);
        };
        BiPredicate<Integer, String> predicate2 = (n, v)->{
            return n >= Integer.parseInt(v);
        };

        System.out.println("Predicate1::: " + predicate1.test(3, "3"));

        System.out.println("Predicate2::: " + predicate2.test(4, "3"));

        BiPredicate<Integer, String> predicate3 = predicate1.or(predicate2);
        System.out.println("Predicate3 v1::: " + predicate3.test(3, "3"));
        System.out.println("Predicate3 v2::: " + predicate3.test(4, "3"));
        BiPredicate<Integer, String> predicate4 = predicate1.negate().and(predicate2);
        System.out.println("Predicate 4 v1::::"+predicate4.test(5, "4"));
    }
}
