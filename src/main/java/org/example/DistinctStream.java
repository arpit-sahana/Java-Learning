package org.example;

import java.util.stream.Stream;

public class DistinctStream {
    public static void main(String[] args) {
        Stream<String> ds = Stream.of("arpit", "arpit", "guarang", "asit", "rat", "Rat", "lion");
        ds.distinct().forEach(System.out::println);

        Stream<Integer> stream = Stream.of(1, 2, 2, 3, 3, 4, 5, 6, 7,7);
        stream.distinct().forEach(System.out::println);
    }
}
