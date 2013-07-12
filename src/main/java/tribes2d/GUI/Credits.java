package tribes2d.GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Credits
 * 
 */
public class Credits extends JDialog {

    private static Credits creditsDialog;
    JPanel creditsContainer;
    
    public Credits(JFrame frame, boolean modal, String myMessage) {
        super(frame, modal);
        creditsDialog = this;
        creditsContainer = new JPanel();
        creditsContainer.setSize(200, 100);
        creditsContainer.setBorder(BorderFactory.createLineBorder(Color.black));
        getContentPane().add(creditsContainer);


        creditsContainer.add(new JLabel("Made by Furling and Pideeeh :D"));
        creditsContainer.add(new JButton(new AbstractAction("Close", null) {
            public void actionPerformed(ActionEvent e) {
                Credits.getThisInstance().dispose();
            }
        }));
        
        setUndecorated(true);
        pack();
        setLocationRelativeTo(frame);
        setVisible(true);
    }

    public static Credits getThisInstance() {
        return creditsDialog;
    }
}