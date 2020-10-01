package h13;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H133 extends Applet {

    Button stenen;
    Button beton;
    Button Reset;
    int wall = 0;

    public void init() {


        stenen = new Button("Stenen muur");
        beton = new Button("Betonnen muur");
        Reset = new Button("Reset");

        stenen.addActionListener(new stenen());
        beton.addActionListener(new beton());
        Reset.addActionListener(new Reset());

        add(Reset);
        add(stenen);
        add(beton);
    }

    public void paint(Graphics g) {

        switch (wall) {
            case 0:
                break;

            case 1:
                drawWall(g, 20, 20, 1160, 660);
                break;

            case 2:
                betonMuur(g, 20, 20, 1160, 660);
                break;

            default:
                break;

        }

    }

    void drawWall(Graphics g, int x, int y, int ww, int hw) {

        g.setColor(Color.gray);
        g.fillRect(x, y, ww, hw);
        g.setColor(Color.red);

        for (int a = 0; a <= ((hw - 3) / 18) - 1; a++) {
            if (a % 2 == 0) {
                for (int i = 0; i <= ((ww - 3) / 33) - 1; i++) {
                    g.fillRect((x + 3) + 33 * i, (y + 3) + 18 * a, 30, 15);
                }
            } else {
                for (int b = 0; b <= ((ww - 3) / 33) - 2; b++) {
                    g.fillRect((x + 21) + 33 * b, (y + 3) + 18 * a, 30, 15);
                    g.fillRect((x + 3), (y + 3) + 18 * a, 15, 15);
                }
            }
        }
    }

    void betonMuur(Graphics g, int x, int y, int ww, int wh) {

        g.setColor(Color.black);
        g.fillRect(x, y, ww, wh);
        g.setColor(Color.gray);

        for (int i = 0; i <= ((wh - 5) / 50) - 1; i++) {
            if (i % 2 == 0) {
                for (int a = 0; a <= ((ww - 5) / 95) - 1; a++) {
                    g.fillRect((x + 5) + 95 * a, (y + 5) + 50 * i, 90, 45);
                }
            } else {
                for (int b = 0; b <= ((ww - 5) / 95) - 2; b++) {
                    g.fillRect((x + 55) + 95 * b, (y + 5) + 50 * i, 90, 45);
                    g.fillRect((x + 5), (y + 5) + 50 * i, 45, 45);
                    g.fillRect(x + (((ww - 5) / 95) * 95 - 40), (y + 5) + 50 * i, 45, 45);
                }
            }
        }
    }


    class Reset implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            wall = 0;
            repaint();
        }
    }

    class stenen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            wall = 1;
            repaint();
        }
    }

    class beton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            wall = 2;
            repaint();
        }
    }
}