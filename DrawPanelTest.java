package org.moro.pages;
import javax.swing.JFrame;
/**
 * Created by eyal on 10/11/2016.
 */
public class DrawPanelTest {
    public static void main(String[] args) {
        // create a panel that contains our drawing
        DrawPanel panel = new DrawPanel();
        // create a new frame to hold the panel
        JFrame application = new JFrame();
        // set the frame to exit when it is closed
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}