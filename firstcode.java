public class HelloWorld {

    // Method to greet the user
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        // Variable declaration
        String userName = "Alice";
        int count = 5;

        // Call method
        greetUser(userName);

        // Conditional statement
        if (count > 0) {
            System.out.println("Countdown starting...");
        }

        // Loop
        for (int i = count; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("Liftoff!");
    }
}