package h14;

import java.awt.*;
import java.applet.Applet;

public class Javaklaar extends Applet {

    int y;

    public void init(){
    }

    public void paint(Graphics g){

        y = 30;
        for (int teller = 0; teller < 10 ; teller++){

            g.drawString("Caspar", 50, y);
            y+=10;

            if(teller == 4){
                g.drawString("je bent op de helft!", 50, y);
                y+=10;
            }
        }
    }
}
