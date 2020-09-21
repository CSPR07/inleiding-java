package h11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H1102 extends Applet {

    Button knop;
    String s;
    int som;
    int y = 20;
    int variabel2 = 1;


    public void init() {
        knop = new Button("OK");
        knop.addActionListener(new Knopje());
        s = "";
        add(knop);

    }

    public void paint(Graphics g) {

        int nummer = 1;

        y = 20;
        int teller = 0;
        int variabel1 = 1;
        while (nummer < 2){
            while (teller < 10) {
                y += 20;
                teller++;
                som = variabel1 * variabel2;
                variabel1++;
                g.drawString(som + "", 60, y);
            }
            nummer++;
            variabel2++;
        }
    }

    private class Knopje implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    }
}