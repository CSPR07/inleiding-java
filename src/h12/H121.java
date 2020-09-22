package h12;

import java.awt.*;
import java.applet.*;

public class H121 extends Applet {
    double salaris[];
    double uitkomst;
    double uitkomst2;

    public void init() {
        salaris = new double [10];

        //getallen voor de tabel verander dit en de uitkomst veranderd mee
        salaris[0] = 100;
        salaris[1] = 200;
        salaris[2] = 300;
        salaris[3] = 400;
        salaris[4] = 500;
        salaris[5] = 600;
        salaris[6] = 700;
        salaris[7] = 800;
        salaris[8] = 900;
        salaris[9] = 1000;

        // extra stap moeten maken omdat hij het niet deed in 1x daarvoor is uitkomst2
        uitkomst = salaris[0] + salaris[1] + salaris[2] + salaris[3] + salaris[4] + salaris[5] + salaris[6] + salaris[7] + salaris[8] + salaris[9];
        uitkomst2 = uitkomst / 10;
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < salaris.length; teller ++) {

            //tabel showcase
            g.drawString("" + salaris[teller], 50, 20 * teller + 20);

            //gemiddelde showcase
            g.drawString(""+ uitkomst2, 205, 95);

            //lijnen van tabel naar gemiddelde
            g.drawLine(90, 20, 200, 90);
            g.drawLine(90, 40, 200, 90);
            g.drawLine(90, 60, 200, 90);
            g.drawLine(90, 80, 200, 90);
            g.drawLine(90, 100, 200, 90);
            g.drawLine(90, 120, 200, 90);
            g.drawLine(90, 140, 200, 90);
            g.drawLine(90, 160, 200, 90);
            g.drawLine(90, 180, 200, 90);
            g.drawLine(90, 200, 200, 90);
        }
    }
}

