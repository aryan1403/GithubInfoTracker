package com.example.Screens;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import org.json.JSONObject;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import java.awt.Image;

public class showData extends JLabel {
    public showData(JSONObject obj) {
        String avurl = obj.getString("avatar_url");
        // URL url;
        try {
            URL url = new URL(avurl);
            Image image = ImageIO.read(url);
            image.getScaledInstance(200, 200, Image.SCALE_SMOOTH);

            this.setBounds(20, 230, 600, 300);
            this.setIcon(new ImageIcon(image));
            this.setText("Name : " + obj.getString("name"));
            
            this.setFont(new Font("Aerial", Font.PLAIN, 18));
            this.setForeground(Color.white);
            this.repaint();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // this.setBackground(new Color(23, 23, 23));
        this.setLayout(null);

    }

}
