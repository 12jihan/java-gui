package com.jehoff;

import javax.swing.*;
import java.awt.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   
        JFrame frame = new JFrame();
        frame.setTitle("testing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JButton button = new JButton("click me!");
        frame.getContentPane().add(button);

        frame.setVisible(true);
    }
}