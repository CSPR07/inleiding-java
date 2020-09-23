package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class H123 extends Applet{
    TextField tekstvak1;
    TextField tekstvak2;
    TextField tekstvak3;
    TextField tekstvak4;
    TextField tekstvak5;

    Button knop1;

    String[] cijfers = {"1", "2", "3", "4", "5"};

    public void init(){
        Arrays.sort(cijfers);

        tekstvak1 = new TextField("", 40);
        tekstvak2 = new TextField("", 40);
        tekstvak3 = new TextField("", 40);
        tekstvak4 = new TextField("", 40);
        tekstvak5 = new TextField("", 35);

        knop1 = new Button("ok");
        knop1.addActionListener(new H123.Knopje());

        add(tekstvak1);
        add(tekstvak2);
        add(tekstvak3);
        add(tekstvak4);
        add(tekstvak5);

        add(knop1);
    }

    public void paint(){
        for (int teller = 0; teller < cijfers.length; teller++){
            getGraphics().drawString(""+ cijfers[teller], 150, 150 * teller + 20);
        }
    }

    private class Knopje implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    }
}
