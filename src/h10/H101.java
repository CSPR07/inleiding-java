package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H101 extends Applet{
    // Namen van stukjes in de app
    int leeftijd, hoogste, laagste;
    TextField tekstvak;
    String tekst, tekst2;
    Label label;
    Button ok;


    public void init() {
        ok = new Button ("OK");
        KnopListener Kl = new KnopListener();
        ok.addActionListener( Kl );

        tekstvak = new TextField("", 5);
        tekst ="";
        tekst2 ="";
        laagste = 100;

        label = new Label("Geef uw leeftijd in en druk op enter");

        add( label );
        add( tekstvak );
        add( ok );
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 45);
        g.drawString(tekst2, 50, 65);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;

            s = tekstvak.getText();
            leeftijd = Integer.parseInt( s );
            if ( leeftijd > hoogste ) {
                hoogste = leeftijd;
                tekst = "De hoogste leeftijd is: " + hoogste;
            }

            if ( leeftijd < laagste ) {
                laagste = leeftijd;
                tekst2 = "het laagste getal is: " + laagste;
            }
            repaint();
        }

    }

}
