package h02;

import java.applet.Applet;
import java.awt.*;

public class Caspar extends Applet {


    public void init() {
        setBackground(Color.blue);
    }
//ik ben beter dan James

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Caspar van Vuure", 50, 60);
    }
}
