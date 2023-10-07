import java.util.Scanner;

public class phân {
    public static void main(String[] args) {
        System.out.println("Nhập giá trị của n: ");
        int n = nhapsonguyen4byte();
        System.out.println("Nhập giá trị của x: ");
        float x = nhapsothucfloat();


        System.out.println("Giá trị của n: " + n);
        System.out.println("Giá trị của x: " + x);
    }

    public static int nhapsonguyen4byte() {
        int value = 0;
        boolean validInput = false;
        Scanner scanner = new Scanner(System.in);

        while (!validInput) {
            try {
                value = scanner.nextInt();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Giá trị nhập không hợp lệ. Vui lòng nhập lại.");
                scanner.nextLine();
            }
        }

        return value;
    }

    public static float nhapsothucfloat() {
        float value = 0;
        boolean validInput = false;
        Scanner scanner = new Scanner(System.in);

        while (!validInput) {
            try {
                value = scanner.nextFloat();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Giá trị nhập không hợp lệ. Vui lòng nhập lại.");
                scanner.nextLine();
            }
        }

        return value;
    }
}