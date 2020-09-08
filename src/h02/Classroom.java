package h02;

import java.applet.Applet;
import java.awt.*;

public class Classroom extends Applet {


    public void init() {
        setBackground(Color.white);
    }
//ik ben beter dan James

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Caspar", 50, 50);
        g.setColor(Color.red);
        g.drawString("van Vuure", 50, 60);
    }
}
