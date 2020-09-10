package h04;

import javafx.scene.layout.Background;

import java.awt.*;
import java.applet.*;

public class H047 extends Applet {

    public void init() {
        setBackground(Color.gray);
    }

    public void paint(Graphics g) {

        g.setColor(Color.white);
        g.drawRoundRect(20, 20, 230, 230, 50, 50);
        g.fillRoundRect(20, 20, 230, 230, 50, 50);

        g.setColor(Color.BLACK);
        g.drawArc(150, 40, 80, 80, 0, 360);
        g.fillArc(150, 40, 80, 80, 0, 360);

        g.drawArc(40, 40, 80, 80, 0, 360);
        g.fillArc(40, 40, 80, 80, 0, 360);

        g.drawArc(40, 150, 80, 80, 0, 360);
        g.fillArc(40, 150, 80, 80, 0, 360);

        g.drawArc(150, 150, 80, 80, 0, 360);
        g.fillArc(150, 150, 80, 80, 0, 360);
    }
}