package com.sustav.devtool.springinside.screansaver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

@Component
public abstract class ColorFrame extends JFrame {

//    @Autowired
//    private Color color;
    private Random random = new Random();
//    @Autowired
//    private ApplicationContext applicationContext;

    public ColorFrame() {
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void showOnRandomPlace() {
        setLocation(random.nextInt(1200), random.nextInt(800));
//        getContentPane().setBackground(color);
//        getContentPane().setBackground(applicationContext.getBean(Color.class));
        getContentPane().setBackground(getColor());
        repaint();
    }

    protected abstract Color getColor();
}
