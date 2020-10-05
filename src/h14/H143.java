package h14;

import java.net.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H143 extends Applet{

    Image smiley;
    URL path;

    public void init(){
        setSize(600, 600);
        path = H143.class.getResource("/h14/resources");
        smiley = getImage (path, "smiley.png");
    }

    public void paint(){
    }
}
