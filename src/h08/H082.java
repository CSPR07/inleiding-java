package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H082 extends Applet {

    Button knop;
    Button knop2;
    Button knop3;
    Button knop4;
    String s;
    TextField tekstvak;

    public void init() {
        tekstvak = new TextField("", 30);
        knop = new Button("Mannen");
        knop2 = new Button("Vrouwen");
        knop3 = new Button("potentiële Mannen");
        knop4 = new Button("potentiële Vrouwen");
        knop.addActionListener(new KnopListener());
        knop2.addActionListener(new KnopListener2());
        knop3.addActionListener(new KnopListener3());
        knop4.addActionListener(new KnopListener4());
        add(knop);
        add(knop2);
        add(knop3);
        add(knop4);
        s = "";
    }

        public void paint(Graphics g) {
        g.drawString(s, 50, 60 );
        g.drawString("het totaal is 32", 50, 74 );
    }

        class KnopListener implements ActionListener	{
            public void actionPerformed( ActionEvent e ) {
                s = tekstvak.getText();
                s = "12 mannen ";
                repaint();
            }
        }

        class KnopListener2 implements ActionListener	{
            public void actionPerformed( ActionEvent e ) {
                s = tekstvak.getText();
                s = "8 vrouwen ";
                repaint();
            }
        }

        class KnopListener3 implements ActionListener	{
            public void actionPerformed( ActionEvent e ) {
                s = tekstvak.getText();
                s = "5 potentiële mannen ";
                repaint();
            }
        }

        class KnopListener4 implements ActionListener	{
            public void actionPerformed( ActionEvent e ) {
                s = tekstvak.getText();
                s = "7 potentiële vrouwen ";
                repaint();
            }
        }

    }

