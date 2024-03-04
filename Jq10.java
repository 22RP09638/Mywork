import java.util.Scanner;

public class jq10 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        // Initialize the calculator
        Calculator calculator = new Calculator();

        // Menu loop
        while (true) {
            System.out.println("\nSimple Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = c.nextInt();

            if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = c.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = c.nextDouble();

            double result;
            switch (choice) {
                case 1:
                    result = calculator.add(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = calculator.sub(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = calculator.mult(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    result = calculator.div(num1, num2);
                    if (Double.isFinite(result)) {
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }

        c.close();
    }
}

class Calculator {
    // Static methods for add, sub, mult, and div
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double sub(double num1, double num2) {
        return num1 - num2;
    }

    public static double mult(double num1, double num2) {
        return num1 * num2;
    }

    public static double div(double num1, double num2) {
        if (num2 == 0) {
            return Double.POSITIVE_INFINITY; // Indicates div by zero
        }
        return num1 / num2;
    }
}
