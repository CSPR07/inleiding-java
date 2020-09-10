package h04;

import javafx.scene.layout.Background;

import java.awt.*;
import java.applet.*;

public class H042 extends Applet{

    public void init () { setBackground (Color.blue);
    }

    public void paint(Graphics g) {

        g.setColor(new Color (178,34,34));
        g.drawPolygon(new int[] {100, 200, 300}, new int[] {100, 10, 100}, 3);
        g.fillPolygon(new int[] {100, 200, 300}, new int[] {100, 10, 100}, 3);
        //Roof

        g.setColor(new Color (250,128,114));
        g.drawRect(125,100, 150,150);
        g.fillRect(125,100, 150,150);
        //House

        g.setColor(new Color	(34,139,34));
        g.drawRect(0,250, 1000,1000);
        g.fillRect(0,250, 1000,1000);
        //Grass

        g.setColor(new Color(139,69,19));
        g.drawRect(205,180, 40,70);
        g.fillRect(205,180, 40,70);
        //door

        g.setColor(new Color(112,128,144));
        g.drawRect(135,180, 40,40);
        g.fillRect(135,180, 40,40);

    }



}
