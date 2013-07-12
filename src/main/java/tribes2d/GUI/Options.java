
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
import tribes2d.xmlreadwrite.XMLRead;
import tribes2d.xmlreadwrite.XMLWrite;
import javax.swing.BorderFactory;

public class Options extends JDialog
{
    private static Options optionsDialog;
    JPanel optionsContainer;
    String ResX,ResY,Playername;
    public Options(JFrame frame, boolean modal)
    {
        super(frame, modal);
        ResX=tribes2d.xmlreadwrite.XMLRead.resX;
        ResY=tribes2d.xmlreadwrite.XMLRead.resY;
        Playername=tribes2d.xmlreadwrite.XMLRead.playername;
        optionsDialog = this;
        optionsContainer = new JPanel();
        optionsContainer.setSize(800, 600);
        optionsContainer.setBorder(BorderFactory.createLineBorder(Color.black));
        getContentPane().add(optionsContainer);
        
        optionsContainer.add(new JLabel("ResolutionX:"));
        optionsContainer.add(new JTextField(ResX,10));
        optionsContainer.add(new JLabel("ResolutionY:"));
        optionsContainer.add(new JTextField(ResY,10));
        optionsContainer.add(new JLabel("Playername:"));
        optionsContainer.add(new JTextField(Playername,10));
        optionsContainer.add(new JButton(new AbstractAction("Accept",null) {

            public void actionPerformed(ActionEvent e) 
            {
                
                Options.getThisInstance().dispose();
            }
        }));
        optionsContainer.add(new JButton(new AbstractAction("Abort",null) {

            public void actionPerformed(ActionEvent e) {
                Options.getThisInstance().dispose(); 
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
