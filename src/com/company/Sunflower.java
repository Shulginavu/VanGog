package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;

class Sunflower extends JComponent {
    void sunflower(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d=(Graphics2D)g;
        Color steb = new Color(85, 107, 47);
        g2d.setStroke(new BasicStroke(4));
        g2d.setColor(steb);
        g2d.drawArc(150, 400, 80, 100, 100, 90);
        g2d.setStroke(new BasicStroke(5f));
        g2d.drawLine(200,250,250,400);
        g2d.drawLine(250,180,270,400);
        g2d.drawLine(335,165,270,400);
        g2d.drawLine(250,180,270,400);
        g2d.drawArc(320, 300, 80, 100, 100, 90);

        g2d.setColor(steb);
        g2d.setStroke(new BasicStroke(2.5f));
        g2d.fill(new Arc2D.Float(170, 400, 180, 100, 100, 100, Arc2D.CHORD));
        g2d.fill(new Arc2D.Float(200, 400, 150, 80, 100, 100, Arc2D.CHORD));
        g2d.fill(new Arc2D.Float(220, 400, 150, 80, 100, 100, Arc2D.CHORD));
        g2d.fill(new Arc2D.Float(135, 430, 50, 80, 100, 100, Arc2D.CHORD));
        g2d.fill(new Arc2D.Float(118, 430, 50, 80, 330, 100, Arc2D.CHORD));
        g2d.fill(new Arc2D.Float(230, 400, 200, 120, 330, 100, Arc2D.CHORD));
        g2d.fill(new Arc2D.Float(210, 400, 200, 120, 330, 100, Arc2D.CHORD));
        g2d.fill(new Arc2D.Float(190, 400, 200, 120, 330, 100, Arc2D.CHORD));
        g2d.fill(new Arc2D.Float(0, 300, 200, 120, 330, 100, Arc2D.CHORD));
        g2d.fill(new Arc2D.Float(-30, 300, 200, 120, 330, 100, Arc2D.CHORD));
        g2d.fill(new Arc2D.Float(410, 310, 200, 120, 100, 100, Arc2D.CHORD));






        Color с8 = new Color(255, 164, 32);
        drawSunflower(g2d,210,380,55,20,Color.orange);
        drawSunflower(g2d,390,380,65,20,с8);
        Color с7 = new Color(255, 215, 0);
        drawSunflower(g2d,300,400,80,20,с7);
        drawSunflower(g2d,300,240,50,20,с8);
        drawSunflower(g2d,400,260,76,20,Color.orange);
        drawSunflower(g2d,200,250,60,20,Color.orange);
        drawSunflower(g2d,250,180,40,20,Color.orange);
        drawSunflower(g2d,150,500,40,20,с8);
        drawSunflower(g2d,335,165,40,20,с8);




    }
    private void drawSunflower(Graphics2D g,int x, int y, int r, int n, Color color){
        g.setColor(color);
        g.fillOval(x-r,y-r,2*r,2*r);
        double an = 2 * Math.PI/n;
        for( int i = 0; i<n; i++){
            double dx1 = Math.cos(an * i);
            double dy1 =  Math.sin(an * i);
            double dx2 = r * Math.cos(an * i);
            double dy2 = r * Math.sin(an * i);
            g.setStroke(new BasicStroke(2.5f));
            Color c = new Color(128, 128, 0);
            g.setColor(c);
            g.drawLine((int)dx1+x,(int)dy1+y,(int)dx2+x,(int)dy2+y);
        }
    }


}
