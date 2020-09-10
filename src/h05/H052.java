package h05;

import java.applet.Applet;
import java.awt.*;

public class H052 extends Applet {
    int jeroen;
    int hans;
    int Valerie;
    Color CValerie;
    Color CJeroen;
    Color CHans;
    Color CAs;

    public void init() {
        setBackground(Color.white);

        //initialisatie
        jeroen = 64;
        hans = 84;
        Valerie = 124;
        //Kijk rij 32 tot en met 37. 100-100kg en 0-0kg y waarde invullen achter het desbetreffende persoon

        CValerie = Color.red;
        CJeroen = Color.green;
        CHans = Color.blue;
        CAs = Color.black;


    }


    public void paint(Graphics g) {
        g.drawString("100", 5, 65);
        g.drawString("80", 5, 85);
        g.drawString("60", 5, 105);
        g.drawString("40", 5, 125);
        g.drawString("20", 5, 145);
        g.drawString("0", 5, 165);

        g.drawLine(30, 180, 30, 40);
        g.drawLine(150, 180, 30, 180);

        g.setColor(CValerie);
        g.drawRect(31, Valerie, 30, 55);
        g.fillRect(31, Valerie, 30, 55);

        g.setColor(CJeroen);
        g.drawRect(60, jeroen, 30, 115);
        g.fillRect(60, jeroen, 30, 115);

        g.setColor(CHans);
        g.drawRect(90, hans, 30, 95);
        g.fillRect(90, hans, 30, 95);

        g.setColor(CAs);
        g.drawString("Valerie", 20, 195);
        g.drawString("jeroen", 60, 195);
        g.drawString("Hans", 100, 195);
    }


}
