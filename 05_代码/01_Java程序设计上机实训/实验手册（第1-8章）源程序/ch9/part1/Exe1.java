package ch9.part1;

import java.awt.*;

import java.applet.*;

public class Exe1 extends Applet

{

       public void paint(Graphics  g)

       {

              int w=getSize().width;          int h=getSize().height;

              g.setColor(Color.red);           g.fillRect(w/2,0,w/2,h/2);

              g.setColor(Color.blue);          g.fillRect(0,h/2,w/2,h/2);             

       }

}


