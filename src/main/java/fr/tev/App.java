package fr.tev;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;


public class App extends JFrame{
    private String name;
    private JFrame window;

    public App(String name) {
        super();
        this.name = name;
        this.window = new JFrame(this.name);

        // Récupérer la taille de l'écran
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        // Récupérer la taille de l'écran
        Dimension screenSize = toolkit.getScreenSize();

        // Définis des dims en fonctions de l'écran
        int width = (int) (screenSize.width * 0.6);
        int height = (int) (screenSize.height * 0.6);

        // Met les dims de la fenêtre en fonction de la taille de l'écran
        this.window.setSize(width, height);

        //centrer la fenêtre a son ouverture
        this.window.setLocationRelativeTo(null);

        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Création de trois boutons
        JButton bMoins = new JButton("moins");
        JButton bModifier = new JButton("modifier");
        JButton bPlus = new JButton("plus");

        bMoins.setAlignmentX(Component.CENTER_ALIGNMENT);
        bModifier.setAlignmentX(Component.CENTER_ALIGNMENT);
        bPlus.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel p = new JPanel();

        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS)); // Layout vertical
        p.add(bMoins);
        p.add(Box.createVerticalStrut((int)(this.window.getHeight() * 0.33))); // Ajoute un espace vertical entre les composants
        p.add(bModifier);
        p.add(Box.createVerticalStrut((int)(this.window.getHeight() * 0.33))); // Ajoute un espace vertical entre les composants
        p.add(bPlus);

        // utilisation d'un BorderLayout
        this.window.getContentPane().setLayout(new BorderLayout());

        this.window.getContentPane().add(p, BorderLayout.WEST);
        p.setBackground(Color.LIGHT_GRAY);

        this.window.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                // Mettre à jour les espacements dynamiquement
                int newSpacing = (int) (window.getHeight() * 0.33);
                p.removeAll(); // Supprimer les anciens composants
                p.add(bMoins);
                p.add(Box.createVerticalStrut(newSpacing)); // Nouvel espacement
                p.add(bModifier);
                p.add(Box.createVerticalStrut(newSpacing)); // Nouvel espacement
                p.add(bPlus);
                p.revalidate(); // Recalculer la disposition
                p.repaint(); // Repeindre l'affichage
            }
        });
    }

    public void start() {
        this.window.setVisible(true);
    }
}
