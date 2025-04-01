package Nivell2.Exercici4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Object> mixedList = new ArrayList<>();
        mixedList.add(1);
        mixedList.add("Exit");
        mixedList.add(85);
        mixedList.add("one");
        mixedList.add("123");
        mixedList.add("swans");
        mixedList.add(9);
        mixedList.add("rhomboid");
        mixedList.add("enter");
        mixedList.add("69");
        mixedList.add("anachronistic");
        mixedList.add(2);

        mixedList.sort((o1, o2) -> {
            if (o1 instanceof String s1 && o2 instanceof String s2) {

                boolean s1HasE = s1.contains("e");
                boolean s2HasE = s2.contains("e");

                if (s1HasE && s2HasE) {
                    return s1.compareToIgnoreCase(s2);
                } else if (s1HasE) {
                    return -1;
                } else if (s2HasE) {
                    return 1;
                }
                return Character.compare(s1.charAt(0), s2.charAt(0));
            }
            if (o1 instanceof String) return -1;
            if (o2 instanceof String) return 1;

            return Integer.compare(Integer.parseInt(o1.toString()), Integer.parseInt(o2.toString()));
        });

        List<Object> mixedListA4 =  mixedList.stream()
                .map(obj -> (obj instanceof String str) ? (str.replace("a", "4")) : obj)
                .collect(Collectors.toList());

        List<Integer> mixedListNums = mixedListA4.stream()
                .map(obj -> {
                    if (obj instanceof String num) {
                        try {
                            return Integer.parseInt(num);
                        } catch (NumberFormatException e) {
                            return obj;
                        }
                    }
                    return obj;
                })
                .filter(Integer.class::isInstance)
                .map(Integer.class::cast)
                .collect(Collectors.toList());

        System.out.println(mixedList);
        System.out.println(mixedListA4);
        System.out.println(mixedListNums);
    }
}
