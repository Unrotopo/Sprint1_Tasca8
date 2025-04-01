package Nivell2.Exercici1;

import java.util.List;
import java.util.stream.Collectors;

public class ThreeAOnly {

    public static List<String> threeAOnly(List<String> list) {
        return list.stream()
                .filter(string -> string.length() == 3 && string.charAt(0) == 'A')
                .collect(Collectors.toList());
    }
}
