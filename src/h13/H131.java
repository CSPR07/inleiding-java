package h13;

import java.applet.*;
import java.awt.*;

public class H131 extends Applet {

    public void init() {
    }

    //Triangle paint
    public void paint(Graphics g) {
        drawTriangle(g, 100, 100, 200, 100, 150, 300);
    }

    //Triangle void
    void drawTriangle(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {

        //lines
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x1, y1);

    }
}