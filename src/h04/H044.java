package h04;

import java.applet.Applet;
import java.awt.*;

public class H044 extends Applet {


    public void init() {
        setBackground(Color.white);
    }
//ik ben beter dan James

    public void paint(Graphics g) {
        g.drawString("100", 5, 65);
        g.drawString("80", 5, 85);
        g.drawString("60", 5, 105);
        g.drawString("40", 5, 125);
        g.drawString("20", 5, 145);
        g.drawString("0", 5, 165);

        g.drawLine(30, 180, 30, 40);
        g.drawLine(150, 180, 30, 180);

        g.setColor(new Color(250, 0, 0));
        g.drawRect(30, 120, 30, 60);
        g.fillRect(30, 120, 30, 60);

        g.setColor(new Color(0, 250, 0));
        g.drawRect(60, 65, 30, 115);
        g.fillRect(60, 65, 30, 115);

        g.setColor(new Color(0, 0, 250));
        g.drawRect(90, 85, 30, 95);
        g.fillRect(90, 85, 30, 95);

        g.setColor(new Color(0, 0, 0));
        g.drawString("Valerie", 20, 195);
        g.drawString("jeroen", 60, 195);
        g.drawString("Hans", 100, 195);

    }
}
