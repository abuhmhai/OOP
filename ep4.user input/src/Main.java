// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        System.out.println("whats ur name?");
        String name=scanner.nextLine();
        System.out.println("how old r u");
        int age=scanner.nextInt();
        scanner.nextLine();//de chay duoc ca 3 cau hoi
        System.out.println("What is ur favorite food?");
        String food=scanner.nextLine();

        System.out.println("Hello "+name);
        System.out.println("U r "+age+" years old");
        System.out.println("U like "+food);
    }
}