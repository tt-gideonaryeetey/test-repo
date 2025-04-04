import java.util.Scanner;

public class DemoApp {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to the Java Demo App ===");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Hi " + name + "! Enter a number: ");
        int number = scanner.nextInt();

        if (isEven(number)) {
            System.out.println("That's an even number.");
        } else {
            System.out.println("That's an odd number.");
        }

        System.out.println("\nLet's count up to your number:");

        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nThanks for using the demo, " + name + "!");
        scanner.close();
    }
}
