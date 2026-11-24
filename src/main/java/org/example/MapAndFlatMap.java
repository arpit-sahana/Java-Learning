package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMap {
    public static void main(String[] args) {
        List<Programmer> programmerList = List.of(new Programmer("Ravi", List.of("Java", "Python", "Ruby")),
                new Programmer("Arpit", List.of("Java", "Html5", "JavaScript")), new Programmer("Gaurang", List.of("Java", "SpringBoot", "ReactJS")));
        programmerList.stream().map(Programmer::getName).toList().forEach(System.out::println);
        programmerList.stream().flatMap(p -> p.getSkills().stream()).collect(Collectors.toSet()).forEach(System.out::println);
    }
}
