package Nivell1.Exercici2;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static List<String> getLongStringsWithO(List<String> stringList) {
        return stringList.stream().filter(token -> token.contains("o") && token.length() > 5).toList();
    }

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("hi", "hellou", "world", "o", "patata", "nice", "noice!", "oraborus");
        System.out.println(getLongStringsWithO(stringList));
    }
}
