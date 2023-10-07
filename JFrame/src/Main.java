import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        //JFrame=a GUI window to add components to

        JFrame frame = new JFrame();//creates a frame
        frame.setTitle("JFrame title goes here");//set title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);//prevent frame from being resized
        frame.setSize(420, 420);//set the x-dimension and y-dimension of frame
        frame.setVisible(true); //make frame visible

        ImageIcon image=new ImageIcon(("milad-fakurian-58Z17lnVS4U-unsplash.png"));// create an ImageIcon
        frame.setIconImage(image.getImage());//change icon of frame
        frame.getContentPane().setBackground(new Color(0x12345));//change color of background
    }
}