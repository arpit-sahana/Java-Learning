package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) throws IOException {
        // Stream of
        Stream<String> stream = Stream.of("Hello", "World", "String 1", "String 2", "String 3");
        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        Integer[] intValue = {1,2,4,5,6,7};

        // Stream Arrays
        String[] string = {"Hello", "World", "String 1", "String 2", "String 3"};
        Stream<String> stream2 = Arrays.stream(string);

        // Stream builder
        Stream.Builder<String> builder = Stream.builder();
        builder.add("hello").add("world").add("String 1").add("String 2").add("String 3");
        Stream<String> stream3 = builder.build();

        // Stream empty
        Stream<String> streamEmpty = Stream.empty();

        // Stream Generate function
        Random random = new Random();
        Supplier<Integer> supplier = () -> random.nextInt(100);
        Stream.generate(supplier).limit(10).forEach(System.out::println);

        // Stream iterate
        Stream<Integer> stream4 = Stream.iterate(1, i -> i + 2).limit(20);
        stream4.forEach(System.out::println);

        /*// Stream from files
        Stream<String> fileStream = Files.lines(Path.of("File_Path"));*/
    }
}
