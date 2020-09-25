package h12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H125 extends Applet{

    Button ok = new Button("Ok");

    int getallen[] = {10, 25, 70, 105, 130, 150, 195, 199, 225, 230};
    Label tekst = new Label("Voer een getal in tussen 1-250, en druk op Ok");

    TextField input = new TextField("",20);

    int nummer;
    int index;

    boolean controle = false;

    public void init() {
        ok.addActionListener(new EnterListener());

        add(tekst);
        add(input);
        add(ok);
    }

    public void paint(Graphics g) {
        if (controle) {
            g.drawString("Het getal staat op de: " + index + "e plaats",50,75);


        } else {
            g.drawString("Het getal staat niet in de index",50,75);
        }
    }

    class EnterListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            controle = false;
            nummer = Integer.parseInt(input.getText());

            for(int i = 0; i < getallen.length; i++) {
                if (nummer == getallen[i]) {
                    index = i;
                    controle = true;
                    break;
                }
            }
            repaint();
        }
    }
}

