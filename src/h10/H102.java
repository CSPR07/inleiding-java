package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H102 extends Applet{
    TextField tekstvak;
    TextField tekstvak2;
    Label label;
    String s, d, tekst;
    int jaartal, maand;

    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak2 = new TextField("", 20);
        label = new Label("Type een maandnummer en dan een jaarnummer druk daarna op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekstvak2.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
        add(tekstvak2);
    }

    public void paint(Graphics g) {
        g.setFont(Font.getFont("myFont"));
        g.drawString(tekst, 150, 75 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maand = Integer.parseInt( s);
            d = tekstvak2.getText();
            jaartal = Integer.parseInt( d);



            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {

                switch(maand) {
                    case 1:
                        tekst = "Januari, 31 dagen";
                        break;
                    case 2:
                        tekst = "Februari, 29 dagen";
                        break;
                    case 3:
                        tekst = "Maart, 31 dagen";
                        break;
                    case 4:
                        tekst = "April, 30 dagen";
                        break;
                    case 5:
                        tekst = "Mei, 31 dagen";
                        break;
                    case 6:
                        tekst = "Juni, 30 dagen";
                        break;
                    case 7:
                        tekst = "Juli, 31 dagen";
                        break;
                    case 8:
                        tekst = "Augustus, 30 dagen";
                        break;
                    case 9:
                        tekst = "September, 30 dagen";
                        break;
                    case 10:
                        tekst = "Oktober, 31 dagen";
                        break;
                    case 11:
                        tekst = "November, 30 dagen";
                        break;
                    case 12:
                        tekst = "December, 31 dagen";
                        break;
                    default:
                        tekst = "U heeft iets verkeerd gedaan";
                        break;
                }
            }
            else {
                switch (maand){
                        case 1:
                            tekst = "Januari, 31 dagen";
                            break;
                        case 2:
                            tekst = "Februari, 28 dagen";
                            break;
                        case 3:
                            tekst = "Maart, 31 dagen";
                            break;
                        case 4:
                            tekst = "April, 30 dagen";
                            break;
                        case 5:
                            tekst = "Mei, 31 dagen";
                            break;
                        case 6:
                            tekst = "Juni, 30 dagen";
                            break;
                        case 7:
                            tekst = "Juli, 31 dagen";
                            break;
                        case 8:
                            tekst = "Augustus, 30 dagen";
                            break;
                        case 9:
                            tekst = "September, 30 dagen";
                            break;
                        case 10:
                            tekst = "Oktober, 31 dagen";
                            break;
                        case 11:
                            tekst = "November, 30 dagen";
                            break;
                        case 12:
                            tekst = "December, 31 dagen";
                            break;
                    default:
                        tekst = "U heeft iets verkeerd gedaan";
                        break;
                }
            }
            repaint();
    }
}
}