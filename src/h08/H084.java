package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H084 extends Applet{

    TextField tekstvak1;
    TextField tekstvak2;
    Button plus;
    Button min;
    Button keer;
    Button delen;
    String q;
    String w;
    double a, s, uitkomst;

    public void init() {
        tekstvak1 = new TextField("", 15);
        tekstvak2 = new TextField("", 15);
        plus = new Button("+");
        min = new Button("-");
        keer = new Button("*");
        delen = new Button("/");
        plus.addActionListener( new plus());
        min.addActionListener( new min());
        keer.addActionListener( new keer());
        delen.addActionListener( new delen());
        add(tekstvak1);
        add(tekstvak2);
        add(plus);
        add(min);
        add(keer);
        add(delen);
        q = "";
        w = "";
    }

    public void paint(Graphics g) {
        g.drawString(String.valueOf(uitkomst), 50, 60 );
    }

    class plus implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            q = tekstvak1.getText();
            w = tekstvak2.getText();
            a = Double.parseDouble( q);
            s = Double.parseDouble( w);
            uitkomst = a + s;
            repaint();
        }
    }

    class min implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            q = tekstvak1.getText();
            w = tekstvak2.getText();
            a = Double.parseDouble( q);
            s = Double.parseDouble( w);
            uitkomst = a - s;
            repaint();

        }
    }

    class keer implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            q = tekstvak1.getText();
            w = tekstvak2.getText();
            a = Double.parseDouble( q);
            s = Double.parseDouble( w);
            uitkomst = a * s;
            repaint();

        }
    }

    class delen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            q = tekstvak1.getText();
            w = tekstvak2.getText();
            a = Double.parseDouble( q);
            s = Double.parseDouble( w);
            uitkomst = a / s;
            repaint();

        }
    }
}
