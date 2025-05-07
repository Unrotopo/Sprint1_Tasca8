package Nivell2.Exercici4.order;

import java.util.List;

public class EGoesFirst {

    public static List<Object> eGoesFirst (List<Object> mixedList) {
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
        return mixedList;
    }
}
