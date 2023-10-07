package com.codebind;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    private JButton nobut;
    private JPanel panel1;
    private JLabel label1;

    public form1()
    {
        nobut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

public static void main(String[] args) {
    JFrame frame = new JFrame("form1");
    frame.setSize(900, 450);
    frame.setContentPane(new form1().panel1);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
}

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}