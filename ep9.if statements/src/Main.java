import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // if statement = performs a block of code if its condition evaluates to be true

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age == 75) {
            System.out.println("Ok Boomer!");
        } else if (age >= 18) {
            System.out.println("You are an adult!");
        } else if (age >= 13) {
            System.out.println("You are a teenager!");
        } else {
            System.out.println("You are not an adult!");
        }

        scanner.close();
    }
}
