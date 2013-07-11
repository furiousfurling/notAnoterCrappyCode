package tribes2d.GUI;

import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JFrame;
import tribes2d.maingame.GameWindow;
import tribes2d.misc.Defaults;

/*
 * Game window
 * 
 */
public class MainWindow extends JFrame{
    private static MainWindow mainWindow;
    public MainWindow(int comp){
        switch(comp){
            case 0:
                add(new MainMenu()); 
                break;
            case 1:
                add(new GameWindow()); 
                setUndecorated(true);
                setExtendedState(MAXIMIZED_BOTH);
                break;
            case 3:
                //add(new Credits()); 
                break;
            default:
        }  
        setTitle(Defaults.WINDOW_NAME); // Name the window
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(Defaults.WINDOW_WIDTH, Defaults.WINDOW_HEIGHT); //Size of window
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }
    public static MainWindow getThisInstance(){
    return mainWindow;
    }
    
    public static void main(String[] args) {
        mainWindow = new MainWindow(0);
    }

}
