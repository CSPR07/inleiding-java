package h06;

import java.awt.*;
import java.applet.*;


public class H0631 extends Applet {
    double a, b, c, d, uitkomst;


    public void init() {
        a = 3;
        b = 2;
        uitkomst = a + b;
    }

    public void paint(Graphics g) {
        g.drawString("het gemiddelde is: -" + uitkomst, 20, 20);
    }
}