/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex48;
import java.util.Scanner;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author x1
 */
interface KPIEvaluator
{
    public double calculateKPI();
}
abstract class Person{
    public String name;
    public int age;
    public String gender;  
    protected String bank_account;
    
    
    public Person(String name,int age,String gender,String bank_account)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.bank_account=bank_account;
    }
    
    
    public abstract String getRole();
    //overloading
    public double calculateKPI(){
        return 0.0;
    }
}


class SinhVien extends Person implements  KPIEvaluator{

    public String maSV;
    //public String ten;
    //public int tuoi;
    //public String gioiTinh;

    public SinhVien(String name, int age, String gender, String bank_account, String maSV) {
        super(name,age,gender,bank_account);
        this.maSV = maSV;
        //this.age = age;
        //this.gender = gender;
        //this.bank_account = bank_account;
    }
    
    @Override
    public String getRole()
    {
        return "Tôi là một sinh viên";
    }
    @Override
    public double calculateKPI(){
        return 0.0;
    }
}

final class ITStudent extends SinhVien implements KPIEvaluator
{
    public String major;
    public ITStudent(String name, int age, String gender, String bank_account, String maSV,String major)
    {
        super(name, age, gender, bank_account, maSV);
        this.major=major;
    }
    @Override
    public String getRole()
    {
        return "Tôi là một sinh viên IT";
    }
    @Override
    public double calculateKPI(){
        return 0.0;
    }
    
}
class BusinessStudent extends SinhVien implements KPIEvaluator
{
    public String major;
    public BusinessStudent(String name, int age, String gender, String bank_account, String maSV,String major)
    { 
        super(name, age, gender, bank_account, maSV);
        this.major=major;
    }
    @Override
    public String getRole()
    {
        return "Tôi là một sinh viên KD";
    }
    @Override
    public double calculateKPI(){
        return 0.0;
    }
}
class LanguageStudent extends SinhVien implements KPIEvaluator
{
    public String major;
    public LanguageStudent(String name, int age, String gender, String bank_account, String maSV,String major)
    { 
        super(name, age, gender, bank_account, maSV);
        this.major=major;
    }
    
    @Override
    public String getRole()
    {
        return "Tôi là một sinh viên NN";
    }
    @Override
    public double calculateKPI(){
        return 0.0;
    }
}
        
        
        
        
public class Ex48 {

    /**
     * @param args the command line arguments
     * @throws java.io.UnsupportedEncodingException
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args)throws UnsupportedEncodingException,IOException,InterruptedException {
        // TODO code application logic here
        ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "chcp 65001").inheritIO();
        pb.start().waitFor();
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
        // Khai báo mảng sinh viên
        //SinhVien[] sinhVien = new SinhVien[100];
        List<SinhVien> list_sv;
        list_sv = new ArrayList<SinhVien> ();
        
        // Khai báo biến
        int i = 0;
        String maSV, ten, gioiTinh;
        int tuoi;
        Scanner sc;
        sc = new Scanner(System.in);
        // Nhập dữ liệu
        System.out.println("Nhập danh sách sinh viên:");
        while (true) {
            System.out.print("Nhập mã sinh viên(Nhập # thì dừng nhập):  ");
            maSV = sc.nextLine();

            if (maSV.equals("#")) {//Nhập vào # thì thoát
                break;
            }

            System.out.print("Nhập họ tên: ");
            ten = sc.nextLine();

            tuoi = 0;
            while (true) {
                // Nhập tuổi
                System.out.print("Nhập tuổi(Nhập giá trị số nguyên từ 9 đến 80): ");
                String tuoiStr = sc.nextLine();
                try {
                    tuoi = Integer.parseInt(tuoiStr);
                    if(tuoi>=9 && tuoi<=80){
                        break;
                    }
                    else{System.out.println("Nhập lại");}
                } catch (NumberFormatException e) {
                    System.out.println("Tuổi phải là số nguyên.");
                }
            }
            
            System.out.print("Nhập giới tính (Nam/Nữ/rỗng): ");
            //gioiTinh = sc.nextLine().toLowerCase();
            while(true){
                try{
                    gioiTinh = sc.nextLine().toLowerCase();
                    if (gioiTinh.equals("nam")==true || gioiTinh.equals("nữ")==true || gioiTinh.equals("") ){
                        break;
                    }   
                    else{System.out.println("Nhập lại");}
                }
                catch(Exception e){
                    System.out.println("Nhập giới tính lại");
                }
            }
            // Lưu dữ liệu vào mảng
            System.out.print("Nhập bank account: ");
            String bank_acc = sc.nextLine();
            
            SinhVien ob;
            ob = new SinhVien(ten,tuoi,gioiTinh,bank_acc,maSV);
            list_sv.add(ob);
            
        }

        // Hiển thị danh sách sinh viên
        
        System.out.println("Danh sách sinh viên:");
        for (int j = 0; j < list_sv.size(); j++) {
            
            System.out.println("Tên: " + list_sv.get(j).name);
            System.out.println("Tuổi: " + list_sv.get(j).age);
            System.out.println("Giới tính: " + list_sv.get(j).gender);
            System.out.println("Tài khoản ngân hàng: " + list_sv.get(j).bank_account);
            System.out.println("Mã sinh viên: " + list_sv.get(j).maSV);
        } 
       
        // Hiển thị SV Nam
        System.out.println("Danh sách hiển thị sinh viên Nam");
        for (int j = 0; j < i; j++) {
            if (list_sv.get(j).gender.equals("nam")){
            System.out.println("Mã sinh viên: " + list_sv.get(j).maSV);
            System.out.println("Tên: " + list_sv.get(j).name);
            System.out.println("Tuổi: " + list_sv.get(j).age);
            System.out.println("Giới tính: " + list_sv.get(j).gender);
            }
        }
        
        System.out.println("Nhấn phím enter để mở GUI");
        sc.nextLine();
                 
        MahForm frml;
        //frml=new MahForm();
        frml=new MahForm(list_sv);
        //frml.list_sinh_vien = list_sv; 
        if (frml.list_sinh_vien == null)
            JOptionPane.showMessageDialog(null,"List sv null");
        frml.setLocationRelativeTo(null);
        
        frml.setVisible(true);
    }   
}
