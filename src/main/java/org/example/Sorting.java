package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(6);
        System.out.println(" Before Sorting" + list);
        /*Collections.sort(list,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });*/
//        Collections.sort(list, (a, b) -> a - b);
        list.sort((a, b) -> a - b);
        System.out.println(" After Sorting" + list);

    }
}
