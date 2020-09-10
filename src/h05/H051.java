package h05;

import javafx.scene.layout.Background;

import java.awt.*;
import java.applet.*;

public class H051 extends Applet {
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        //initialisatie
        opvulkleur = Color.magenta;
        lijnkleur = Color.BLACK;
        breedte = 85;
        hoogte = 65;
        setBackground(Color.white);

    }

    public void paint(Graphics g) {

        g.setColor(lijnkleur);
        g.drawLine(15, 40, 100, 40);

        g.drawRect(15, 60, breedte, hoogte);

        g.drawRoundRect(15,140,breedte, hoogte, 10, 10);

        g.setColor(opvulkleur);
        g.fillRect(110, 60, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawArc(110, 60, breedte, hoogte, 0, 360);

        g.setColor(opvulkleur);
        g.drawArc(110, 140, breedte, hoogte, 0, 360);
        g.fillArc(110, 140, breedte, hoogte, 0, 360);

        g.setColor(lijnkleur);
        g.drawArc(200, 140, 63, 63, 0, 360);

        g.drawArc(200, 60, breedte, hoogte, 0, 360);
        g.setColor (opvulkleur);
        g.fillArc(200, 60, breedte, hoogte, 0, 30);

    }
}