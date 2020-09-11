package h06;

import javafx.scene.layout.Background;

import java.awt.*;
import java.applet.*;

public class H062 extends Applet {
    int sec, uren, dagen, secinuur, secindag, secinjaar;

    public void init() {
        sec = 60;
        uren = 24;
        dagen = 365;
        secinuur = sec * sec;
        secindag = secinuur * sec;
        secinjaar = secindag * dagen;

    }

    public void paint(Graphics g) {
        g.setColor(new Color(0, 0, 0));
        g.drawString("seconden in een uur: " + secinuur, 20, 25);
        g.drawString("seconden in een dag: " + secindag, 20, 35);
        g.drawString("seconden in een jaar: " + secinjaar, 20, 45);
    }
}