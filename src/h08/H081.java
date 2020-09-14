package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H081 extends Applet {
    TextField tekstvak;
    Button knop;
    Button knop2;
    String s;

    public void init() {
        tekstvak = new TextField("", 30);
        knop = new Button("OK");
        knop2 = new Button("Reset");
        knop.addActionListener( new KnopListener() );
        add(tekstvak);
        s = "";
        add(knop);
        add(knop2);
        knop2.addActionListener( new KnopListener() );
    }

    public void paint(Graphics g) {
        g.drawString(s, 50, 60 );
    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            s = tekstvak.getText();
            repaint();
        }
    }
}