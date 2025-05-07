package Nivell2.Exercici3;

public class Main {
    public static void main(String[] args) {

        Operation operation = (String op, float a, float b) -> switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };

        System.out.println(operation.operation("+", 32, 7));
        System.out.println(operation.operation("-", 32, 7));
        System.out.println(operation.operation("*", 3, 7));
        System.out.println(operation.operation("/", 31, 7));
    }
}
