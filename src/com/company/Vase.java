package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;

class Vase extends JComponent {
    void vase(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d=(Graphics2D)g;
        Color с2 = new Color(139, 69, 19); //грань стола
        g2d.setColor(с2);
        g2d.drawLine(0,600,600,600);

        Color c3 = new Color(189, 183, 107);
        g2d.setColor(c3);
        g2d.fillOval(180, 300, 230, 400);
        Color c4 = new Color(139, 69, 19);
        g2d.setStroke(new BasicStroke(2.5f));
        g2d.setColor(c4);
        g2d.drawOval(180, 300, 230, 400);

        Color с1 = new Color(184, 134, 11);
        g2d.setColor(с1);
        g2d.fillRect(0, 670, 600, 200);

        g2d.setStroke(new BasicStroke(2.5f));  // толщина равна 8
        Color с5 = new Color(139, 69, 19); //грань стола
        g2d.setColor(с5);
        g2d.drawLine(235,670,355,670);


        g2d.fillRect(0, 0, 600, 400);
        Color с6 = new Color(173, 216, 230);
        g2d.setColor(с6);
        g2d.fillRect(0, 0, 600, 400);


    }
}
