package Nivell2.Exercici4.order;

import java.util.List;

public class OrderByFirstChar {

    public static List<Object> orderByFirstChar(List<Object> mixedList) {
        mixedList.sort((o1, o2) -> {
            if (o1 instanceof String && o2 instanceof String) return o1.toString().compareToIgnoreCase(o2.toString());
            else return o1.toString().compareTo(o2.toString());
                });
        return mixedList;
    }
}
