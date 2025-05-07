package Nivell2.Exercici4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> mixedList = new ArrayList<>();
        mixedList.add(1);
        mixedList.add("Exit");
        mixedList.add(85);
        mixedList.add("one");
        mixedList.add("enemy");
        mixedList.add("123");
        mixedList.add("swans");
        mixedList.add(9);
        mixedList.add("rhomboid");
        mixedList.add("enter");
        mixedList.add("69");
        mixedList.add("anachronistic");
        mixedList.add(2);

        List<Object> mixedList1 = OrderByFirstChar.orderByFirstChar(mixedList);
        System.out.println("\n---- List ordered by first char ----");
        mixedList1.forEach(System.out::println);

        List<Object> mixedList2 = EGoesFirst.eGoesFirst(mixedList);
        System.out.println("\n---- Elements that start with 'e' go first ----");
        mixedList2.forEach(System.out::println);

        List<Object> mixedList3 =  FourInsteadOfA.fourInsteadOfA(mixedList);
        System.out.println("\n---- Change every 'a' with 4 ----");
        mixedList3.forEach(System.out::println);

        List<Integer> mixedList4 =  OnlyNumbers.onlyNumbers(mixedList);
        System.out.println("\n---- Show only numbers, even strings ----");
        mixedList4.forEach(System.out::println);
    }
}
