package h14;

import com.sun.org.apache.xml.internal.utils.res.XResources_de;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H141 extends Applet {

    String kleur[] = {"harten", "schoppen", "ruiten", "klaver"};
    String nummer[] = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "vrouw", "heer"};

    String kiezen = "";

    Button delen;

    double rand1;
    double rand2;

    public void init() {
        delen = new Button ("Druk hier om te delen");
        delen.addActionListener( new kl());
        add(delen);
    }

    public void paint(Graphics g) {
        g.drawString( kiezen , 50, 50);
    }

    private class kl implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            rand1 = Math.random() * 13;
            rand2 = Math.random() * 4;

            int rnd1 = (int) rand1;
            int rnd2 = (int) rand2;

            kiezen = kleur[rnd2] + " " + nummer[rnd1];

            repaint();
        }
    }
}
