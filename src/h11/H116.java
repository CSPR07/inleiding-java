package h11;

import java.awt.*;
import java.applet.*;

public class H116 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        int teller = 1;

        int x = 100;
        int y = 100;
        int w = 1;
        int h = 1;


        while(teller < 6) {
            x += -10;
            y += -10;
            w += 20;
            h += 20;
            g.drawArc(x, y, w, h, 0, 360);
            teller++;
        }
    }
}
