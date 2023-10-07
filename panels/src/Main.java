import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // JPanel= a GUI component that functions as a container to hold other components
        ImageIcon icon=new ImageIcon("/Users/macbookprom1/Desktop/OOP/panels/src/nhan-vat-shin-cau-be-but-chi-hinh-anh-png-620.png");


        JLabel label=new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        //label.setVerticalAlignment(JLabel.CENTER);
        //label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0,0,100,100);


        JPanel redPanel=new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
        redPanel.setLayout(null);

        JPanel bluePanel=new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);
        bluePanel.setLayout(null);


        JPanel greenPanel=new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout(null);

         JFrame frame=new JFrame();
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setLayout(null);
         frame.setSize(750,750);
        frame.setVisible(true);
        bluePanel.add(label);
        frame.add(redPanel);
         frame.add(bluePanel);
         frame.add(greenPanel);


    }
}