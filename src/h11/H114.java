package h11;

import java.awt.*;
import java.applet.*;

public class H114 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        int som = 0;
        int teller = 1;

        int y = 20;
        int variabel1 = 1;


        while(teller < 12) {
            y += 20;
            g.drawString(som + "", 30, y);
            som = variabel1 * 3;
            variabel1 ++;
            teller++;
        }
    }
}
