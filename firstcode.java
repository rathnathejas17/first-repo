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
        System.out.println("Hello, World!");
    }
}
