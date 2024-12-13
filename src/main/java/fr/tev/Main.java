package fr.tev;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Create a window (JFrame)
        JFrame frame = new JFrame("My First Swing App");

        // Set size and close operation
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add a label
        JLabel label = new JLabel("Hello, Swing!", SwingConstants.CENTER);
        frame.add(label);

        // Make the frame visible
        frame.setVisible(true);
    }
}