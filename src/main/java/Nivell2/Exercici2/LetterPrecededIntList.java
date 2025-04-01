package Nivell2.Exercici2;

import java.util.ArrayList;
import java.util.List;

public class LetterPrecededIntList {

    public static String letterPreceder(List<Integer> intList) {

        List<String> letterPlusInt = new ArrayList<String>();

        intList.forEach(num -> letterPlusInt.add(num % 2 == 0 ? "e" + num : "o" + num));

        return String.join(", ", letterPlusInt);
    }
}
