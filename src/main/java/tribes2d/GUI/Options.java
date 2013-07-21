
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
import javax.swing.BorderFactory;

public class Options extends JDialog
{
    private static Options optionsDialog;
    JPanel optionsContainer;
    int ResX,ResY;
    String playername;
    JTextField jTextField0,jTextField1,jTextField2;
    public Options(JFrame frame, boolean modal)
    {
        super(frame, modal);
        ResX=tribes2d.xmlreadwrite.XMLRead.getResX();
        ResY=tribes2d.xmlreadwrite.XMLRead.getResY();
        playername=tribes2d.xmlreadwrite.XMLRead.getPlayerName();
        
        optionsDialog = this;
        optionsContainer = new JPanel();
        optionsContainer.setSize(800, 600);
        optionsContainer.setBorder(BorderFactory.createLineBorder(Color.black));
        getContentPane().add(optionsContainer);
        
        optionsContainer.add(new JLabel("ResolutionX:"));
        optionsContainer.add(jTextField0= new JTextField(ResX+"",10));
        optionsContainer.add(new JLabel("ResolutionY:"));
        optionsContainer.add(jTextField1=new JTextField(ResY+"",10));
        optionsContainer.add(new JLabel("Playername:"));
        optionsContainer.add(jTextField2=new JTextField(playername,10));
        optionsContainer.add(new JButton(new AbstractAction("Accept",null) {

            public void actionPerformed(ActionEvent e) 
            {
                ResX= Integer.parseInt(jTextField0.getText());
                ResY= Integer.parseInt(jTextField1.getText());
                playername = jTextField1.getText();
                tribes2d.xmlreadwrite.XMLWrite.WriteConfig(ResX+"",
                        ResY+"",playername);
                Options.getThisInstance().dispose();
                System.out.println("ELLO");
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
