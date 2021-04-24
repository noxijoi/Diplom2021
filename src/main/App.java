package main;


import mails.mail;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton mail;
    private JPanel panMain;

    public App() {
        mail.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mails.mail mailMainWindow = new mail();
                mailMainWindow.open();
            }
        });
    }

    public static void main (String[] args) {
        JFrame frame = new JFrame("Система ТС");
        frame.setContentPane(new App().panMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
