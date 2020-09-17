package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H105 extends Applet{
    // Namen van stukjes in de app
    double cijfer;
    TextField tekstvak;
    String tekst;
    Label label;
    Button ok;


    public void init() {
        ok = new Button ("OK");
        KnopListener Kl = new KnopListener();
        ok.addActionListener( Kl );

        tekstvak = new TextField("", 4);
        tekst ="";

        label = new Label("Voer je cijfer in en dan weet je of je een voldoende hebt of niet");

        add( label );
        add( tekstvak );
        add( ok );
    }

    public void paint(Graphics g) {
        setBackground(Color.green);
        g.setColor(Color.black);
        g.drawString(tekst, 120, 75);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;

            s = tekstvak.getText();
            cijfer = Integer.parseInt( s );
            if ( cijfer > 5.5 ) {
                tekst = "je hebt een voldoende gehaald! ";
            }

            if ( cijfer < 5.5 ) {
                tekst = "je hebt een onvoldoende";
            }
            {
            if ( cijfer > 10 ) {
                tekst = "het cijfer moet onder de 10 zijn!";
            }
            repaint();
        }

    }

}}
