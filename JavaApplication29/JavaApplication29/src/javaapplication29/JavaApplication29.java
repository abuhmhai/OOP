/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication29;

import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author huyng
 */
public class JavaApplication29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Nhan Enter de chuyen sang dao dien do hoa");
        Scanner sc;
        sc=new Scanner(System.in);
        sc.nextLine();
               
        
        ////////////////////////////////////
//        JFrame frm1;
//        frm1= new JFrame();
//        frm1.setSize(800,600);
//        frm1.setTitle("Form ví dụ");
//        
//        
//        
        myframe frm1;
        frm1=new myframe();
        frm1.setSize(800,600);
        frm1.setVisible(true);
    }
        
}
