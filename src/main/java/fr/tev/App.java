package fr.tev;

import javax.swing.*;

public class App {
    private String name;
    private JFrame window;

    public App(String name) {
        this.name = name;
        this.window = new JFrame(this.name);
    }

    public void start() {
        this.window.setSize(800, 800);
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.setVisible(true);
    }
}
