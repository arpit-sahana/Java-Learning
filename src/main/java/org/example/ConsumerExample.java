package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<Integer> consumer = System.out::println;
        consumer.accept(1);
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        forEach(list, consumer);
        Consumer<String> consumerString = System.out::println;
        List<String> list2 = Arrays.asList("Test", "Arpit", "Alpesh", "Gaurang");
        forEach(list2, consumerString);
    }

    static <T> void forEach(List<T> list , Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
