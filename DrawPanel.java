package org.moro.pages;

import javax.swing.*;
import java.awt.*;

/**
 * Created by eyal on 10/11/2016.
 */
public class DrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        // call paintComponent to ensure the panel displays correctly
        super.paintComponent(g);

        int width = getWidth(); // total width
        int height = getHeight(); // total height

        g.drawLine(0, 0, width, height);
        g.drawLine(0, height, width, 0);
    }
}