package Nivell1.Exercici8;

public class Main {

    public static void main(String[] args) {

        Reverse reverse = (String s) -> String.valueOf(new StringBuilder(s).reverse());
        System.out.println(reverse.myReverse("Look mom! Without hands"));
    }
}
