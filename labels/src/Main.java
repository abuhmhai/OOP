import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //JLabel = a GUI display area for a string of text, an image, or both
            ImageIcon image = new ImageIcon("/Users/macbookprom1/Desktop/OOP/labels/src/nhan-vat-shin-cau-be-but-chi-hinh-anh-png-620.png");
            Border border=BorderFactory.createLineBorder(Color.green,3);

            JLabel label = new JLabel();//create a label
            label.setText("Bro, do u even code?");//set text of labe
            label.setIcon (image);
            label.setHorizontalTextPosition(JLabel.CENTER);//set text LEFT,CENTER,RIGHT in imageicon
            label.setVerticalTextPosition(JLabel.TOP);//set text TOP,CENTER,BOTTOM in imageicon
            label.setForeground(new Color(0x8CDBE5));
            label.setFont(new Font("MV Boli",Font.ITALIC,20)) ;//set font of text
            label.setIconTextGap(0);//set gap of text to image
            label.setBackground(Color.black);//set background color
            label.setOpaque(true); //display background color
            label.setBorder(border);
            label.setVerticalAlignment(JLabel.CENTER);//set vertical position of icon+text within label
            label.setHorizontalAlignment(JLabel.CENTER); //set horizontal positiion of icon+text within label
            label.setBounds(100,100,250,250);//set x,y position within frame as well as dimensions


            JFrame frame = new JFrame();;
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame. setSize (400,400);
            //frame.setLayout(null);
            frame.setVisible(true);
            frame.add(label);
            frame.pack();//resized being no change


    }
}