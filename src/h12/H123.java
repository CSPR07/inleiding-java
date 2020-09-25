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

    int[] cijfers = {1, 2, 3, 4, 5};

    public void init(){

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
            String s;
            int p;
            s = tekstvak1.getText();
            p = (int) Double.parseDouble(s);
            cijfers[0]=p;

            s = tekstvak2.getText();
            p = (int) Double.parseDouble(s);
            cijfers[1]=p;

            s = tekstvak3.getText();
            p = (int) Double.parseDouble(s);
            cijfers[2]=p;

            s = tekstvak4.getText();
            p = Integer.parseInt(s);
            cijfers[3]=p;

            s = tekstvak5.getText();
            p = (int) Double.parseDouble(s);
            cijfers[4]=p;

            Arrays.sort(cijfers);

            tekstvak1.setText( cijfers[0] +"");
            tekstvak2.setText( cijfers[1] +"");
            tekstvak3.setText( cijfers[2] +"");
            tekstvak4.setText( cijfers[3] +"");
            tekstvak5.setText( cijfers[4] +"");
            repaint();
        }
    }
}