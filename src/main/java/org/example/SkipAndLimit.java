package org.example;

import java.util.stream.Stream;

public class SkipAndLimit {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(1, i -> i + 1);
        stream.skip(100).limit(10).forEach(System.out::println);
    }
}
