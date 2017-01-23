package org.moro.pages;

import javax.swing.*;

/**
 * Created by eyal on 07/11/2016.
 */
public class Gui {
    public static void main(String[]args){

        String name = JOptionPane.showInputDialog("What is your name?");

        String message =
                String.format("Welcome, %s, to Java Programming!", name);

        JOptionPane.showMessageDialog(null, message);
//        JOptionPane.showMessageDialog(null, "Welcome to my house");
    }
}
