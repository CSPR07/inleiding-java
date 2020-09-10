package h04;

import javafx.scene.layout.Background;

import java.awt.*;
import java.applet.*;

public class H045 extends Applet{

    public void init () { setBackground (Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawArc(50,50,100, 100, 0, 360);
        g.fillArc(50,50,100, 100, 0, 360);
    }



}