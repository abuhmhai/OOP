import java.util.Scanner;

public class c {
    // Hàm nhập số thực
    public static float inputFloat() {
        float value = 0;
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Nhập một số thực: ");
                value = scanner.nextFloat();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Sai định dạng! Vui lòng nhập lại.");
                scanner.nextLine(); // Đọc dòng mới từ bàn phím
            }
        }
        return value;
    }

    // Hàm nhập mảng số thực
    public static float[] inputFloatArray(int n) {
        float[] array = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = inputFloat();
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        float[] arr = inputFloatArray(n);

        System.out.println("Mảng vừa nhập:");
        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử thứ " + (i + 1) + ": " + arr[i]);
        }

        scanner.close();
    }
}
