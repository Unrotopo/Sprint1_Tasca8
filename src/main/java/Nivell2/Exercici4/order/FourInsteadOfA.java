package Nivell2.Exercici4.order;

import java.util.List;

public class FourInsteadOfA {

    public static List<Object> fourInsteadOfA (List<Object> mixedList) {
        return mixedList.stream()
                .map(obj -> (obj instanceof String str) ? (str.replace("a", "4")) : obj)
                .toList();
    }
}
