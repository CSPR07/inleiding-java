package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H106 extends Applet{
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
        tekstvak.addActionListener( Kl );
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
            if (cijfer <= 0 ) {
                tekst = "Dit kan niet het moet tussen de 1 en de 10 zijn";
            }
            else if ( cijfer < 4 ) {
                tekst = "je hebt een super slecht cijfer gehaald! ";
            }

            if ( cijfer == 4 ) {
                tekst = "je hebt een onvoldoende gehaald";
            }

            if ( cijfer == 5 ) {
                tekst = "je hebt een matig cijfer gehaald";
            }

            if ( cijfer == 6 || cijfer == 7 ) {
                tekst = "je hebt een voldoende gehaald";
            }

            if ( cijfer > 7 ) {
                tekst = "je hebt een goed gehaald";
            }

            if ( cijfer > 10 ) {
                tekst = "het cijfer moet onder de 10 zijn!";
            } repaint();

        }

    }}