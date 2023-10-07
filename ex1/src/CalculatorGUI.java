import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame {
    private JTextField textFieldA;
    private JTextField textFieldB;
    private JLabel resultLabel;

    public CalculatorGUI() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel labelA = new JLabel("A:");
        textFieldA = new JTextField(10);

        JLabel labelB = new JLabel("B:");
        textFieldB = new JTextField(10);

        JButton calculateButton = new JButton("Tính");
        calculateButton.addActionListener(new CalculateButtonListener());

        JButton exitButton = new JButton("Thoát");
        exitButton.addActionListener(new ExitButtonListener());

        resultLabel = new JLabel();

        panel.add(labelA);
        panel.add(textFieldA);
        panel.add(labelB);
        panel.add(textFieldB);
        panel.add(calculateButton);
        panel.add(exitButton);
        panel.add(resultLabel);

        add(panel);
    }

    private class CalculateButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                int a = parseInteger(textFieldA.getText());
                int b = parseInteger(textFieldB.getText());
                int sum = a + b;
                resultLabel.setText("Kết quả: " + sum);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Vui lòng nhập số nguyên hợp lệ");
            }
        }
    }

    private class ExitButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    private int parseInteger(String text) throws NumberFormatException {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }
    }

    public static void main(String[] args) {
        CalculatorGUI calculatorGUI = new CalculatorGUI();
        calculatorGUI.setVisible(true);
    }
}