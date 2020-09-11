package h06;

import java.awt.*;
import java.applet.*;


public class H063 extends Applet {
    double a, b, c, d, uitkomst;


    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;
        uitkomst = (a + b + c) / d;
        uitkomst = (int)(uitkomst*10);
        uitkomst = uitkomst /10;
    }

    public void paint(Graphics g) {
        g.drawString("het gemiddelde is: " + uitkomst, 20, 20);
    }
}