package Nivell1.Exercici6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> things = new ArrayList<>();

        things.add("potato");
        things.add(2);
        things.add(1_000_000);
        things.add("one");
        things.add("two");
        things.add(23_452);
        things.add("three");
        things.add("hi");
        things.add(69);
        things.add("69 ;)");

        System.out.println("----- List -----");
        things.forEach(System.out::println);

        things.sort((o1, o2) -> {
            int lengthO1 = (o1 instanceof String) ? ((String) o1).length() : 0;
            int lengthO2 = (o2 instanceof String) ? ((String) o2).length() : 0;
            return lengthO1 - lengthO2;
        });

        System.out.println(" ----- Sorted List -----");
        things.forEach(System.out::println);
    }
}
