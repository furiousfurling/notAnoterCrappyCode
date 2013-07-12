
package tribes2d.GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JDialog;
import tribes2d.misc.Defaults;
import java.io.*;
import javax.swing.BorderFactory;

public class Options extends JDialog
{
    private static Options optionsDialog;
    JPanel optionsContainer;
    
    public Options(JFrame frame, boolean modal)
    {
        super(frame, modal);
        optionsDialog = this;
        optionsContainer = new JPanel();
        optionsContainer.setSize(800, 600);
        optionsContainer.setBorder(BorderFactory.createLineBorder(Color.black));
        getContentPane().add(optionsContainer);
        
        optionsContainer.add(new JLabel("ResolutionX:"));
        optionsContainer.add(new JTextField(10));
        optionsContainer.add(new JLabel("ResolutionY:"));
        optionsContainer.add(new JTextField(10));
        optionsContainer.add(new JButton(new AbstractAction("Accept",null) {

            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }));
        optionsContainer.add(new JButton(new AbstractAction("Abort",null) {

            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }));
        
        setUndecorated(true);
        pack();
        setLocationRelativeTo(frame);
        setVisible(true);
        
    }
    public static Options getThisInstance() {
        return optionsDialog;
    }
    
}
