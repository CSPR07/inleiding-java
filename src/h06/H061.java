package h06;

import javafx.scene.layout.Background;

import java.awt.*;
import java.applet.*;

public class H061 extends Applet {
    int Totaal;
    int uitkomstA;
    int uitkomstB;
    int uitkomstC;
    int uitkomstD;
    int p;

    public void init() {
        Totaal = 113;
        p = 4;
        uitkomstA= Totaal / p;
        uitkomstB = Totaal / p;
        uitkomstC = Totaal / p;
        uitkomstD = Totaal / p;
    }

    public void paint(Graphics g) {
        g.setColor(new Color(0, 0, 0));
        g.drawString("jeanette krijgt: " + uitkomstA, 20, 25);
        g.drawString("jan krijgt: " + uitkomstB, 20, 35);
        g.drawString("Ali krijgt: " + uitkomstC, 20, 45);
       g.drawString("ik krijg: " + uitkomstD, 20, 55);
    }
}