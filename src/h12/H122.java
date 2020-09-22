package h12;

import java.awt.*;
import java.applet.*;

public class H122 extends Applet {
    Button[] namen = new Button[25];

    public void init() {
        for (int teller = 0; teller < namen.length; teller ++) {
            namen[teller] = new Button("" +(teller +1));
            add(namen[teller]);
        }
    }

    public void paint(Graphics g) {
    }
}