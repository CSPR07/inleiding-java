package h11;

import java.awt.*;
import java.applet.*;

public class H119 extends Applet {
    Color zwart;
    Color wit;

    public void init() {
    }

    public void paint(Graphics g) {

        int teller = 1;

        int x = 50;
        int y = 50;
        int w = 60;
        int h = 60;

        zwart = Color.BLACK;
        wit = Color.white;


        for(teller = 0; teller < 9; teller++) {
            if (teller == 0 || teller == 2 || teller == 4 || teller ==6) {
                g.setColor(zwart);
                g.fillRect(x, y, w, h);
            }
            else {
                g.setColor(wit);
                g.fillRect(x, y, w, h);
            }
            x += w;

        }

        //tweede rij
        x = 50;
        y += h;

        for (teller = 0; teller < 8; teller++) {
            if (teller == 0 || teller == 2 || teller == 4 || teller == 6) {
                g.setColor(wit);
                g.fillRect(x, y, w, h);
            } else {
                g.setColor(zwart);
                g.fillRect(x, y, w, h);
            }
            x += w;
        }

        //derde rij
        x = 50;
        y += h;

        for (teller = 0; teller < 8; teller++) {
            if (teller == 0 || teller == 2 || teller == 4 || teller == 6) {
                g.setColor(zwart);
                g.fillRect(x, y, w, h);
            } else {
                g.setColor(wit);
                g.fillRect(x, y, w, h);
            }
            x += w;
        }

        //vierde rij
        x = 50;
        y += h;

        for (teller = 0; teller < 8; teller++) {
            if (teller == 0 || teller == 2 || teller == 4 || teller == 6) {
                g.setColor(wit);
                g.fillRect(x, y, w, h);
            } else {
                g.setColor(zwart);
                g.fillRect(x, y, w, h);
            }
            x += w;
        }

        //vijfde rij
        x = 50;
        y += h;

        for (teller = 0; teller < 8; teller++) {
            if (teller == 0 || teller == 2 || teller == 4 || teller == 6) {
                g.setColor(zwart);
                g.fillRect(x, y, w, h);
            } else {
                g.setColor(wit);
                g.fillRect(x, y, w, h);
            }
            x += w;
        }

        //zesde rij
        x = 50;
        y += h;

        for (teller = 0; teller < 8; teller++) {
            if (teller == 0 || teller == 2 || teller == 4 || teller == 6) {
                g.setColor(wit);
                g.fillRect(x, y, w, h);
            } else {
                g.setColor(zwart);
                g.fillRect(x, y, w, h);
            }
            x += w;
        }

        //zevende rij
        x = 50;
        y += h;

        for (teller = 0; teller < 8; teller++) {
            if (teller == 0 || teller == 2 || teller == 4 || teller == 6) {
                g.setColor(zwart);
                g.fillRect(x, y, w, h);
            } else {
                g.setColor(wit);
                g.fillRect(x, y, w, h);
            }
            x += w;
        }
        //achtste rij
        x = 50;
        y += h;

        for (teller = 0; teller < 8; teller++) {
            if (teller == 0 || teller == 2 || teller == 4 || teller == 6) {
                g.setColor(wit);
                g.fillRect(x, y, w, h);
            } else {
                g.setColor(zwart);
                g.fillRect(x, y, w, h);
            }
            x += w;
        }
        g.setColor(zwart);
        g.drawRect(50, 50, 480, 480);
    }
}
