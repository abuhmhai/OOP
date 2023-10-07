// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n=0;
        float x=0;

        Scanner scanner=new Scanner(System.in);

        //Input n values
        boolean validInput=false;
        while(!validInput){
            try{
                System.out.print("Enter n: ");
                n=scanner.nextInt();
                validInput=true;

            }
            catch(Exception e){
                System.out.println("Invalid value. Please try again");
                scanner.nextLine();
            }
        }
        //Input x value
        validInput=false;
        while (!validInput) {
            try{
                System.out.print("Enter x: ");
                x=scanner.nextFloat();
                validInput=true;

            }
            catch(Exception e){
                System.out.println("Invalid value.Please try again");
                scanner.nextLine();
            }
        }
        scanner.close();

        //In ra mh
        System.out.println("N= "+n);
        System.out.println("X= "+x );
    }
}