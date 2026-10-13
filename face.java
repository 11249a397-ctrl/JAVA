/*
AIM:

To write a Java applet program to draw a smiley face using graphics methods.

ALGORITHM:

Start the program.

Import the required AWT and Applet packages.

Create a class named face that extends the Applet class.

Override the paint() method.

Use drawOval() to draw the face, eyes, and ears.

Use fillOval() to draw the pupils.

Use fillArc() and drawArc() or oval methods to draw the nose and mouth as required.

Execute the applet to display the smiley face.

Stop the program.
*/
program
import java.awt.*;
import java.io.*;
import java.applet.*;

public class face extends Applet
{
   /*
<applet code="face.class" width="300" height="300">
</applet>
*/ public void paint(Graphics g)
    {
        g.drawOval(40, 40, 120, 150);
        g.drawOval(57, 75, 30, 20);
        g.drawOval(110, 75, 30, 20);

        g.drawOval(68, 81, 10, 10);
        g.fillOval(121, 81, 10, 10);

        g.fillArc(85, 100, 30, 30, 0, 180);
        g.fillArc(60, 125, 80, 40, 180, 180);

        g.drawOval(25, 92, 15, 30);
        g.drawOval(160, 92, 15, 30);
    }
}
output: face-output.png 
  /* https://github.com/11249a397-ctrl/JAVA/blob/main/cardlayout-output.png /*
  
  /*result: awaking a human face usimng applets is successfully executed*/
