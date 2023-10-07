import javax.swing.*;
import javax.swing.JButton;
import java.awt.*;
import javax.swing.BorderFactory;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame implements ActionListener{
    JButton button;
    JLabel label;
    MyFrame(){
        //ImageIcon icon=new ImageIcon("/Users/macbookprom1/Desktop/OOP/buttons/src/png-clipart-pictogram-information-library-business-proposal-miscellaneous-text.png");
        label=new JLabel();
        ImageIcon icon2=new ImageIcon("/Users/macbookprom1/Desktop/OOP/buttons/src/png-clipart-pictogram-information-library-business-proposal-miscellaneous-text.png");
        label.setBounds(150,250,150,150);
        label.setVisible(false);
        label.setIcon(icon2);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        button=new JButton();
        button.setBounds(100,100,250,100);
        button.addActionListener(this);
        button.setText("Im a button!");
        button.setFocusable(true);
        //button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setIconTextGap(-15);// far or close within button
        button.setForeground(Color.cyan);
        button.setBackground(Color.blue);
        button.setBorder(BorderFactory.createEtchedBorder());


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }
     @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
           // System.out.println("poo");//when clicked on it which will print poo
            button.setEnabled(false);//Enable to clicked on it, and click buttons once time
            label.setVisible(true);
        }
    }
}
