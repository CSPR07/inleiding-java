package h4;

import javafx.scene.layout.Background;

import java.awt.*;
import java.applet.*;

public class H048 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {

        g.setColor(Color.black);
        g.drawLine(15, 40, 100, 40);

        g.drawRect(15, 60, 85, 65);

        g.drawRoundRect(15,140,85,65, 10, 10);

        g.setColor(Color.magenta);
        g.fillRect(110, 60, 85, 65);
        g.setColor(Color.BLACK);
        g.drawArc(110, 60, 83, 63, 0, 360);

        g.setColor(Color.magenta);
        g.drawArc(110, 140, 83, 63, 0, 360);
        g.fillArc(110, 140, 83, 63, 0, 360);

        g.setColor(Color.black);
        g.drawArc(200, 140, 63, 63, 0, 360);

        g.drawArc(200, 60, 83, 63, 0, 360);
        g.setColor(Color.magenta);
        g.fillArc(200, 60, 83, 63, 0, 30);

    }
}