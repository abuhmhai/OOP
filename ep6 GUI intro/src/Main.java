// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
       String name=JOptionPane.showInputDialog("Enter ur name ");
       JOptionPane.showMessageDialog(null,"Hello "+name);

       int age=Integer.parseInt(JOptionPane.showInputDialog("Enter ur age"));
        JOptionPane.showMessageDialog(null,"You r "+age+" years old");

        double height=Double.parseDouble(JOptionPane.showInputDialog("Enter ur height"));
        JOptionPane.showMessageDialog(null,"You r "+height+" cm");
    }
}