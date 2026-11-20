package org.example;

import java.util.List;
import java.util.function.Predicate;

public class StringProcessor {

    static List<String> filter(List<String> list, Predicate<String> predicate) {
        return list.stream().filter(predicate).toList();
    }
}
