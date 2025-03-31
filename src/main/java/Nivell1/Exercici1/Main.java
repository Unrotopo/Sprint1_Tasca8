package Nivell1.Exercici1;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static List<String> getStringsWithO(List<String> stringList) {
        return stringList.stream().filter(token -> token.contains("o")).toList();
    }

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("hi", "hello", "world", "o", "patata", "nice", "noice");
        System.out.println(getStringsWithO(stringList));
    }
}
