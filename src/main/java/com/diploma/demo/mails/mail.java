package com.diploma.demo.mails;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mail {

    private JButton inmessage;
    private JButton outmessage;
    private JPanel mailMainPane;


    public mail() {
        inmessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mail mailMainWindow = new mail();
                mailMainWindow.open();
            }
        });
        outmessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mail mailMainWindow = new mail();
                mailMainWindow.open();
            }
        });
    }

    public void open(){
        JFrame framemail = new JFrame("корреспонденция");
        framemail.setContentPane(new mail().mailMainPane);
        framemail.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framemail.pack();
        framemail.setVisible(true);
    }
}