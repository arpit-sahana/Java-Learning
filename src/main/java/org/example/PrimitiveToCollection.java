package org.example;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveToCollection {

    public static void main(String[] args) {
        List<String> stringList = Stream.of("a", "b", "c", "d", "e").toList();
        stringList.forEach(System.out::println);

        List<Integer> streamIntegerList = IntStream.of(1,2,3,4,5).boxed().toList();
        streamIntegerList.forEach(System.out::println);

        List<Integer> streamIntegerList2 = IntStream.of(1,2,3,4,5).boxed().toList();
        streamIntegerList2.forEach(System.out::println);

        List<Integer>  streamIntegerList3 = IntStream.of(1,2,3,4,5).mapToObj(Integer::valueOf).toList();
        streamIntegerList3.forEach(System.out::println);
    }
}
