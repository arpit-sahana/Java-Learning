package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionWithHM {
    public static void main(String[] args) {
        Map<Integer, String>  map = new HashMap<>();
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
        map.put(4, "4");
        map.put(5, "5");

        BiFunction<Integer, String , String> biFunction = (key, value) -> key + value;
        map.compute(1, biFunction);
        map.computeIfPresent(4, biFunction);
        Function<Integer, String> biFunction2 = String::valueOf;
        map.computeIfAbsent(10, biFunction2);
        System.out.println("HashMAP::::" + map);
    }
}
