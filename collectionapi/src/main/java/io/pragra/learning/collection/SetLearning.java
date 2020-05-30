package io.pragra.learning.collection;

import java.util.*;

public class SetLearning {
    public static void main(String[] args) {
        Set<String> strings = new TreeSet<>();
        strings.add("Vivek");
        strings.add("Vivek");
        strings.add("Ajay");
        strings.add("James");
        strings.add("Vivek");
        strings.add("Vivek");
        strings.add("Kiran");
        strings.add("Kiran");
        strings.add("Kiran");
        strings.add("Kiran");

       // System.out.println("Atin".hashCode());
//        System.out.println(new Student("Atin","java").hashCode());
//        System.out.println(new Student("Atin","java").hashCode());
        List<String> guest = Arrays.asList("Adam", "Michael");
        strings.addAll(guest);
        List<String> finalList = new ArrayList<>();
        finalList.addAll(strings);
        System.out.println(finalList);
        System.out.println(finalList.get(2));
    }
    // Set is sorted collection of unique element
}
