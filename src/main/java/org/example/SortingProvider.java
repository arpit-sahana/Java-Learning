package org.example;

public class SortingProvider {

    public int compareByName (Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }

    public  int compareByAge (Employee e1, Employee e2) {
        return e1.getAge() - e2.getAge();
    }
}
