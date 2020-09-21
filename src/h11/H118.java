package h11;

import java.awt.*;
import java.applet.*;

public class H118 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        int teller = 1;

        int x = 600;
        int y = 500;
        int w = 1;
        int h = 1;

        while(teller < 101) {
            x += -4;
            y += -4;
            w += 8;
            h += 8;
            g.drawArc(x, y, w, h, 0, 360);
            teller++;
        }
    }
}
