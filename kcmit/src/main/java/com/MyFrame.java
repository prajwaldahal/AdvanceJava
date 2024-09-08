/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

/**
 *
 * @author prajwal
 */
public class MyFrame extends JPanel{
    Shape rect;
    public MyFrame() {
        rect=new Rectangle2D.Double(107,100,100,100);
        setVisible(true);
        setSize(300,300);
        JFrame f = new JFrame();
        f.add(this);                                                     
        f.setVisible(true);
       
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D) g;
        g2.draw(rect);
    }
    public static void main(String[] args) {
       
       new MyFrame();
    }
}
