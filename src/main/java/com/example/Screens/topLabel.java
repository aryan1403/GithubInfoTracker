package com.example.Screens;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class topLabel extends JLabel{
    public topLabel() {
        this.setBounds(20, 30, 400, 70);
        this.setText("GitHub");
        this.setFont(new Font("Comic Sans", Font.BOLD + Font.ITALIC, 50));
        this.setForeground(Color.white);
        this.setBackground(new Color(23,23,23));
        this.setLayout(null);
    }
}
