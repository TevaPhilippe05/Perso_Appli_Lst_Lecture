package fr.tev;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame{
    private String name;
    private JFrame window;

    public App(String name) {
        super();
        this.name = name;
        this.window = new JFrame(this.name);
        this.window.setSize(800, 800);
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Création de trois boutons
        JButton bMoins = new JButton("moins");
        JButton bModifier = new JButton("modifier");
        JButton bPlus = new JButton("plus");

        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        p.add(bMoins);
        p.add(bModifier);
        p.add(bPlus);

        // utilisation d'un BorderLayout
        this.window.getContentPane().setLayout(new BorderLayout());

        this.window.getContentPane().add(p, BorderLayout.SOUTH);
        p.setBackground(Color.LIGHT_GRAY);
    }

    public void start() {
        this.window.setVisible(true);
    }
}
