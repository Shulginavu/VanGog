package com.company;

import java.awt.*;
import java.awt.geom.Arc2D;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        /* Задание заголовка окна*/
        JFrame w = new JFrame("Окно с изображением");
        /*Задание размеров окна*/
        w.setSize(600, 750);

        /* 	Если у окна не будет функции закрытия,
         *	при нажатии крестика окно не закроется.*/
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*	Менеджер определяет
         *  каким образом в окне расположены объекты.*/
        w.setLayout(new BorderLayout(1, 1));

        Canvas canv = new Canvas();
        w.add(canv);
        w.setVisible(true);
    }

}
