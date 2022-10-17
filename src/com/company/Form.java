package com.company;

import javax.swing.*;
import java.awt.*;

public class Form extends JFrame {

    public Form (){
        setTitle("Рисовашки круга");
        setSize(666, 666);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(new Color(0xeadff2 ));
    }

    @Override
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(0x9979c1));

        g2d.fillOval(83, 83, 500, 500);
    }
}
