package form1;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Form1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("Nhấn Enter để chuyển sang giao diện đồ họa.");
//        Scanner sc;
//        sc = new Scanner(System.in);
//        sc.nextLine();
//        JFrame frm1;
//        frm1 = new JFrame();
//        frm1.setSize(800,600);
//        frm1.setTitle("From ví dụ");myFrame frm1;
//        JButton jButton1 = new JButton("Thoát"); // Tạo nút "Thoát"
//        frm1.add(jButton1); // Thêm nút vào Jframe
//        frm1.setLocationRelativeTo(null); // Đặt JFrame ở giữa màn hình
        myform1 frm1;
        frm1 = new myform1();
//        frm1.setSize(800,600);
        frm1.setTitle("Form ví dụ");
              
        frm1.setVisible(true);
    }
    
}
