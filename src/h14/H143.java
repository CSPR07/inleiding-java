package h14;

import java.net.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H143 extends Applet {

    //invoeren
    Image Blokje;
    URL path;
    Button enter;
    Button opnieuw;
    TextField tekstvak;

    //memory's
    int blokjes = 23;
    boolean beurt = true;
    boolean match = false;
    boolean verloren = false;

    //String
    String tekst1 = "";
    String tekst2 = "Voer 1,2 of 3 in en druk op play!";

    public void init() {

        //size
        setSize(500,500);

        tekst1 = tekst2;

        //smiley
        path = H143.class.getResource("/h14/resources/");
        Blokje = getImage(path, "jas.png");

        //Knoppen
        enter = new Button("enter");
        opnieuw = new Button("Reset");

        //teksten
        tekstvak = new TextField("",10);
        enter.addActionListener(new playListener());
        opnieuw.addActionListener(new resetListener());

        //adds
        add(tekstvak);
        add(enter);
        add(opnieuw);

    }

    public void paint(Graphics g) {
        //String tekst
        g.drawString(tekst1,70,50);
        for (int i = 0; i < blokjes; i++) {
            //image String
            g.drawImage(Blokje, 100 + 50 * (i % 4), 100 + 50 * (i / 4), 50, 50, this);
        }
    }

    int botPlays(int userplay, int smileys) {
        int botplays = 0;
        double random = Math.random() * 3 + 1;
        int r = (int)random;

        //eerste zet bot
        if(smileys == 23) {
            switch(userplay) {
                case 1:
                    botplays = 1;
                    break;
                case 2:
                    botplays = r;
                    break;
                case 3:
                    botplays = 3;
                    break;
            }


        //code voor het eerste pad
        }else if(smileys == 21 || smileys == 17 || smileys == 13 || smileys == 9|| smileys == 5) {
            switch(userplay) {
                case 1:
                    botplays = 3;
                    break;
                case 2:
                    botplays = 2;
                    break;
                case 3:
                    botplays = 1;
                    break;
            }

        //code voor het tweede pad
        }else if(smileys == 20 || smileys == 16 || smileys == 12 || smileys == 8|| smileys == 4){
            switch(userplay) {
                case 1:
                    botplays = 2;
                    break;
                case 2:
                    botplays = 1;
                    break;
                case 3:
                    botplays = r;
                    break;
            }

        //code voor het derde pad
        }else if(smileys == 19 || smileys == 15 || smileys == 11 || smileys == 7|| smileys == 3){
            switch(userplay) {
                case 1:
                    botplays = 1;
                    break;
                case 2:
                    botplays = r;
                    break;
                case 3:
                    botplays = 3;
                    break;
            }

        //code voor het vierde pad
        }else if(smileys == 18 || smileys == 14 || smileys == 10 || smileys == 6|| smileys == 2){
            switch(userplay) {
                case 1:
                    botplays = r;
                    break;
                case 2:
                    botplays = 3;
                    break;
                case 3:
                    botplays = 2;
                    break;
            }
        }else {
            botplays =r;
        }

        return botplays;
    }


    class playListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int userplay = 0;
            int bot = 0;
            if(Integer.parseInt(tekstvak.getText()) == 1 || Integer.parseInt(tekstvak.getText()) == 2 || Integer.parseInt(tekstvak.getText()) ==3) {
                userplay = Integer.parseInt(tekstvak.getText());
                bot = botPlays(userplay,blokjes);

                beurt = true;
                blokjes-=userplay;
                if(blokjes <= 0 && match == false) {
                    if(true == true) {
                        verloren = true;
                        match = true;
                    }
                }

                beurt = false;
                blokjes-=bot;
                if(blokjes <= 0 && match == false) {
                    verloren = false;
                    match = true;
                }

                tekst1 = "Bot koos " + bot + " blokjes te verwijderen.";

            }else {
                tekst1 = "Het moet een getal tussen de 1 en 3 zijn";
                repaint();
            }



            if(match==true) {
                if(verloren == false) {
                    tekst1 = "Victory Royale!";
                }else {
                    tekst1 = "n00b!!";
                }
            }


            tekstvak.setText("");
            repaint();
        }
    }

    class resetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            tekst1 = tekst2;
            blokjes = 23;
            verloren = false;
            match = false;
            beurt = true;
            repaint();
        }
    }
}