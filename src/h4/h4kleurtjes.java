package h4;

import javafx.scene.layout.Background;

import java.awt.*;
import java.applet.*;

public class h4kleurtjes extends Applet{

    public void init () { setBackground (Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawRect(20,20,100,100);
        g.fillRect(20, 20, 100, 100);
    }



}
