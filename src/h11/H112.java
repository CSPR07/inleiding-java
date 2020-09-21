package h11;

import java.awt.*;
import java.applet.*;

public class H112 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int x = 0;

        for(teller = 20; teller > 9; teller--) {
            x += 20;
            g.drawString("" + teller, x, 35 );
        }
    }
}
