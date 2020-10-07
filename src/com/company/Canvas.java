package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;

/* Класс, который будет рисовать элементы*/
class Canvas extends JComponent {

    /*Метод, перерисовывающий элемент внутри окна
     *при обновлении*/
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        Graphics2D g2d=(Graphics2D)g;

       Background background = new Background();
       background.background(g2d);

       Vase vase = new Vase();
       vase.vase(g2d);

       Sunflower sunflower = new Sunflower();
       sunflower.sunflower(g2d);

        String str = "Shulgina";
        g2d.drawString(str,240,650);

        /* 	Вызывает обновление себя после завершения рисования	*/
        super.repaint();
    }

}