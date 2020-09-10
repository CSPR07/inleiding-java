package h04;

import javafx.scene.layout.Background;

import java.awt.*;
import java.applet.*;

public class H041 extends Applet{

    public void init () { setBackground (Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawPolygon(new int[] {150, 200, 250}, new int[] {100, 10, 100}, 3);
        g.fillPolygon(new int[] {150, 200, 250}, new int[] {100, 10, 100}, 3);
    }



}
