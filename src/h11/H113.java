package h11;

import java.awt.*;
import java.applet.*;

public class H113 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int y = 70;

        int variabel1 = 1;
        int variabel2 = 1;
        int variabel3;
        g.drawString(variabel1 + "", 50, 50);
        g.drawString(variabel2 + "", 50, 70);

        for(teller = 2; teller < 10; teller++) {
            y += 20;
            variabel3 = variabel1 + variabel2;
            variabel1 = variabel2;
            variabel2 = variabel3;
            g.drawString("" + variabel3, 50, y );
        }
    }
}
