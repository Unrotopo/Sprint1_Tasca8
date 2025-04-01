package Nivell2.Exercici2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1, 223, 30, 4, 51, 6_000, 72, 83, 9, 10);

        System.out.println(LetterPrecededIntList.letterPreceder(numList));
    }
}
