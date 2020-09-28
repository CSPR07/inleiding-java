package h12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H126 extends Applet {

    int getal[] = {15, 12, 2, 5, 6, 2, 7, 8, 4, 6, 2, 5 ,3, 9, 7, 9, 6, 8, 9, 8, 0, 3, 4, 6, 7, 3, 6, 4, 3, 5, 1, 4, 5, 5, 12, 15, 12, 13, 11, 10, 10, 12, 13 ,15, 14, 13, 11, 14, 69};
    Label tekst1 = new Label("Voer een getal in onder 15");
    TextField tekstvak1 = new TextField("",20);
    Button ok = new Button("Ok");

    int nummer = 0;
    int komtvoor = 0;

    public void init() {
        ok.addActionListener(new ButtonListener());
        add(tekst1);
        add(tekstvak1);
        add(ok);
    }

    public void paint(Graphics g) {
        g.drawString("Het ingevulde getal komt "+ komtvoor +" keer voor in de array",50,75);
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            komtvoor = 0;
            nummer = Integer.parseInt(tekstvak1.getText());
            for (int j : getal) {
                if (nummer == j) {
                    komtvoor++;
                }

                repaint();
            }
        }
    }
}
