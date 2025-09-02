public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object to read input

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Read a line of text

        System.out.println("Hello, " + name + "! Welcome to Java.");
        
        scanner.close();  // Always close the scanner
    }
}
