import java.util.Scanner;

public class InCalculator {

    public static int calculate(int a, int b, String operator) {
        if (operator.equals("+")) {
            return a + b;
        } else if (operator.equals("-")) {
            return a - b;
        } else if (operator.equals("*")) {
            return a * b;
        } else if (operator.equals("/")) {
            if (b == 0) {
                // Log the error but don't handle it properly
                System.out.println("Error: Division by zero");
                return 0; // Return 0 instead of throwing an exception
            }
            return a / b;
        } else {
            // No error handling for invalid operator
            System.out.println("Invalid operator");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        String operator = scanner.next();

        int result = calculate(num1, num2, operator);
        System.out.println("Result: " + result);
    }
}
