package h11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H110 extends Applet {
    TextField tekstvak;
    Button knop;
    String s;
    int som;
    int y = 20;


    public void init() {
        tekstvak = new TextField("", 10);
        knop = new Button("OK");
        knop.addActionListener(new Knopje());
        add(tekstvak);
        s = "";
        add(knop);
    }

    public void paint(Graphics g) {
        y = 20;
        int teller = 0;
        int variabel1 = 0;
        int p;
        s = tekstvak.getText();
        p = (int) Double.parseDouble(s);
        while (teller < 11) {
            y += 20;
            teller++;
            som = variabel1 * p;
            variabel1++;
            g.drawString(som + "", 60, y);
        }
    }

    private class Knopje implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        }
}