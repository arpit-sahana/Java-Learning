package org.example;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamForPrimitive {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 10);
        intStream.forEach(System.out::println);

        IntStream intStream2 = IntStream.range(1, 10);
        intStream2.forEach(System.out::println);

        LongStream longStream = LongStream.range(20L, 30L);
        longStream.forEach(System.out::println);

        LongStream longStream2 = LongStream.rangeClosed(20L, 30L);
        longStream2.forEach(System.out::println);
    }
}
