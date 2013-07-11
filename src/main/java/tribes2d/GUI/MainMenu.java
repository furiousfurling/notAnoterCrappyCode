package tribes2d.GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import tribes2d.misc.Defaults;

/*
 * Main menu
 * 
 */
public class MainMenu extends JPanel {

    private final static JButton singlePlayer = new JButton(Defaults.SINGLE_PLAYER);
    private final static JButton multiPlayer = new JButton(Defaults.MULTI_PLAYER);
    private final static JButton viewStats = new JButton(Defaults.VIEW_STATS);
    private final static JButton viewOptions = new JButton("Options");
    private final static JButton viewCredits = new JButton(Defaults.VIEW_CREDITS);
    private final static JButton exitGame = new JButton(Defaults.EXIT_GAME);

    
    public MainMenu() {
        setLayout(new BoxLayout(getMainMenu(), BoxLayout.Y_AXIS));
        add(Box.createRigidArea(new Dimension(0, 200))); //Free space at the top
        addActionEvents();
        addAButton(singlePlayer, getMainMenu());
        addAButton(multiPlayer, getMainMenu());
        addAButton(viewStats, getMainMenu());
        addAButton(viewOptions, getMainMenu());
        addAButton(viewCredits, getMainMenu());
        addAButton(exitGame, getMainMenu());
    }

    private MainMenu getMainMenu() {
        return this;
    }

    private static void addAButton(JButton button, Container container) {
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setBackground(Color.CYAN);
        container.add(button);
        container.add(Box.createRigidArea(new Dimension(0, 5)));//Spacing between boxes
    }

    private static void addActionEvents() {
        singlePlayer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MainWindow.getThisInstance().dispose();
                new MainWindow(1);
            }
        });

        multiPlayer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Execute when button is pressed
            }
        });

        viewStats.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Execute when button is pressed
            }
        });

        viewCredits.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Open Credits
                new Credits(MainWindow.getThisInstance(),true,"this is text");
                
            }
        });

        exitGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Close the window
                MainWindow.getThisInstance().dispose();
            }
        });

    }
}