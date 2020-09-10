package h04;

import java.awt.*;
import java.applet.*;

public class H043 extends Applet {

    public void init() {
        setBackground(new Color(105, 105, 105));
    }

    public void paint(Graphics g) {
        g.setColor(new Color (230,230,250));
        g.drawRect(25, 45, 20, 300);
        g.fillRect(25, 45, 20, 300);
        //vlaggenstok

        g.setColor(new Color (255,0,0));
        g.drawRect(45, 45, 250, 60);
        g.fillRect(45, 45, 250, 60);
        //vlag blauw

        g.setColor(new Color (255,250,250));
        g.drawRect(45, 105, 250, 60);
        g.fillRect(45, 105, 250, 60);
        //vlag wit

        g.setColor(new Color (0,0,255));
        g.drawRect(45, 165, 250, 60);
        g.fillRect(45, 165, 250, 60);
        //vlag rood
    }


}
