package Nivell2.Exercici1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> multipleStrings = Arrays.asList("Any", "words", "are", "in", "this", "list", "AaA", "aAA");

        System.out.println(ThreeAOnly.threeAOnly(multipleStrings));
    }
}
