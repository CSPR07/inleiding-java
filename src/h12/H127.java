package h12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H127 extends Applet {

    //string
    String naam2[] = new String[10];

    //int
    int telefoonnummers[] = new int[10];
    int toon = 0;
    int scherm = 10;

    //new add
    Label tekst1 = new Label("Voer uw naam en telefoonnummer in");
    Button ok = new Button("Ok");
    Label naam1 = new Label("Naam: ");
    TextField tekstveld1 = new TextField("",20);
    Label telefoonnummer1 = new Label("Telefoonnummer: ");
    TextField tekstveldtelefoon1 = new TextField("",20);

    public void init() {

        //Applet full size
        setSize(1920,1080);

        //knop submittion
        ok.addActionListener(new okListener());

        //adds
        add(tekst1);
        add(naam1);
        add(tekstveld1);
        add(telefoonnummer1);
        add(tekstveldtelefoon1);
        add(ok);
    }

    public void paint(Graphics g) {
        if (toon == 10) {
            for (int i = 0; i <10; i++) {
                String nummer = String.valueOf(i + 1) + "";
                g.drawString(" telefoonnummer van" + naam2 + " is: "+ telefoonnummers[i],120,100 + (i + 1) * 15);
            }
        } else {
            g.drawString("nog " + scherm + " telefoonnummers te gaan met namen",120,100);
        }
    }

    private class okListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            naam2[toon] = tekstveld1.getText();
            telefoonnummers[toon] = Integer.parseInt(tekstveldtelefoon1.getText());
            toon++;
            scherm--;
            repaint();
        }
    }
}
