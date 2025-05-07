package Nivell2.Exercici4;

import java.util.List;

public class OnlyNumbers {

    public static List<Integer> onlyNumbers(List<Object> mixedList) {
        return mixedList.stream()
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
                .toList();
    }
}
