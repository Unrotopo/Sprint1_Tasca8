package Nivell2.Exercici3;

public class Main {
    public static void main(String[] args) {

        // Muchos else if no gustan. Más limpio!!

        Operation operation = (String op, float a, float b) -> {
            float c = 0;
            if (op.equals("+")) c = a + b;
            else if (op.equals("-")) c = a - b;
            else if (op.equals("*")) c = a * b;
            else if (op.equals("/")) c = a / b;
            return c;
        };

        System.out.println(operation.operation("+", 32, 7));
        System.out.println(operation.operation("-", 32, 7));
        System.out.println(operation.operation("*", 3, 7));
        System.out.println(operation.operation("/", 31, 7));
    }
}
