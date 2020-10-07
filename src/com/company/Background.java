package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;

class Background extends JComponent {
        void background(Graphics g) {
            super.paintComponents(g);
            Graphics2D g2d=(Graphics2D)g;
            g2d.drawRect(0, 0, 600, 900); //фон
            Color с = new Color(173, 216, 230);
            g2d.setColor(с);
            g2d.fillRect(0, 0, 600, 900);

            g2d.drawRect(0, 600, 600, 300); //стол
            Color с1 = new Color(184, 134, 11);
            g2d.setColor(с1);
            g2d.fillRect(0, 600, 600, 300);
            g2d.setStroke(new BasicStroke(8));  // толщина равна 8

        }
    }

