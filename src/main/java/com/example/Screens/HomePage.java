package com.example.Screens;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.example.Service.service;
import org.json.JSONObject;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;

public class HomePage {
    JFrame frame = new JFrame("API Testing");
    JTextField textField = new JTextField();
    public HomePage(){
        JLabel label = new JLabel("Enter your Username");
        label.setBounds(20, 150, 250, 50);
        label.setFont(new Font("Comic Sans", Font.BOLD + Font.ITALIC, 22));
        label.setBackground(new Color(23,23,23));
        label.setForeground(Color.CYAN);
        label.setLayout(null);

        textField.setBounds(270, 150, 380, 50);
        textField.setFont(new Font("Aerial", Font.PLAIN, 20));
        textField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.white));
        textField.setBackground(new Color(23,23,23));
        textField.setForeground(Color.white);
        textField.setLayout(null);

        JButton button = new JButton("GET");
        button.setFocusable(false);
        button.setBounds(570, 50, 80, 40);
        button.setBackground(new Color(23,23,23));
        button.setForeground(Color.white);
        button.setBorder(BorderFactory.createMatteBorder(0, 2, 2, 0, Color.GREEN));
        button.setOpaque(true);
        button.setFont(new Font("Callibri", Font.BOLD + Font.ITALIC, 20));
        button.setLayout(null);
        button.addActionListener(e -> {
            String username = textField.getText();
            try {
                JSONObject obj = new service().get("https://api.github.com/users/"+username);
                frame.add(new showData(obj));
                frame.repaint();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });

        frame.setSize(700, 600);
        frame.getContentPane().setBackground(new Color(23,23,23));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        frame.add(new topLabel());
        frame.add(textField);
        frame.add(label);
        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);
    }
   
}
