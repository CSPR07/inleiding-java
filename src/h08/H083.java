package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H083 extends Applet {
    TextField tekstvak;
    Button knop;
    Button knop2;
    String s;
    double a, getal, uitkomst;

    public void init() {
        tekstvak = new TextField("", 30);
        knop = new Button("OK");
        knop2 = new Button("Reset");
        knop.addActionListener( new KnopListener() );
        add(tekstvak);
        s = "";
        a = 1.21;
        add(knop);
        add(knop2);
        knop2.addActionListener( new Caspar() );
    }

    public void paint(Graphics g) {
        g.drawString(String.valueOf(uitkomst), 50, 60 );
    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            s = tekstvak.getText();
            getal = Double.parseDouble( s);
            uitkomst = getal * a;
            repaint();
        }
    }
    class Caspar implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText ("");
            s = "";
            repaint();
        }
    }
}