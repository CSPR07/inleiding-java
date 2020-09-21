package h11;

import java.awt.*;
import java.applet.*;

public class H115 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        int teller = 1;

        int y = 20;
        int x = 20;


        while(teller < 6) {
            y += 20;
            x += 20;
            g.drawRect(x, y, 20, 20);
            teller++;
        }
    }
}
