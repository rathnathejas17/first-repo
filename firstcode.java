public class HelloWorld {

    // Method to greet the user
    public static void greetUser(String name) {
        System.out.println("Hello world, " + name + "!");
    }

    public static void main(String[] args) {
        // Variable declaration
        String userName = "Alice";
        int count = 5;

        // Call method
        greetUser(userName);

        // Conditional statement
        if (count > 0) {
            System.out.println("Countdown starting in...");
        }

        // Loop
        for (int i = count; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("Liftoff!");
    }
}

public class Welcome {

    public static void main(String[] args) {
        System.out.println("Welcome to Java Programming!");
    }
}
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!,how are you");
    }
}

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result;

        // Perform calculation
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    scanner.close();
                    return;
                }
                break;

            default:
                System.out.println("Invalid operator!");
                scanner.close();
                return;
        }

        // Output result
        System.out.println("Result: " + result);

        scanner.close();
    }
}