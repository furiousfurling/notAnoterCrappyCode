
package tribes2d.player;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class DiscDefault 
{
    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image image;

    private int speed;

public DiscDefault() {}
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public void move() {
        x += dx;
        y += dy;
    }
 public Image getImage() {
        return image;
    }
}