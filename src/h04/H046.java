package h04;

import javafx.scene.layout.Background;

import java.awt.*;
import java.applet.*;

public class H046 extends Applet{

    public void init () { setBackground (Color.LIGHT_GRAY);
    }

    public void paint(Graphics g) {

        g.setColor(Color.BLACK);
        g.drawRect(40,40,70,200);
        g.fillRect(40,40,70,200);

        g.setColor(Color.red);
        g.drawArc(50,50,50, 50, 0, 360);
        g.fillArc(50,50,50, 50, 0, 360);
        g.setColor(Color.yellow);
        g.drawArc(50,110,50, 50, 0, 360);
        g.fillArc(50,110,50, 50, 0, 360);
        g.setColor(Color.GREEN);
        g.drawArc(50,170,50, 50, 0, 360);
        g.fillArc(50,170,50, 50, 0, 360);

        g.setColor(Color.darkGray);
        g.drawRect(65, 240, 20, 150);
        g.fillRect(65, 240, 20, 150);
    }



}