/*AIM:

To write a Java applet program to draw different shapes using graphics methods.

ALGORITHM:

Start the program.

Import the required AWT and Applet packages.

Create a class named dinerect that extends the Applet class.

Override the paint() method.

Use drawLine() to draw straight and diagonal lines.

Use drawRect() to draw a rectangle.

Use fillRect() to draw a filled rectangle.

Use drawRoundRect() to draw a rounded rectangle.

Use fillRoundRect() to draw a filled rounded rectangle.

Execute the applet to display all the shapes.

Stop the program.
*/
program
import java.awt.*;
import java.io.*;
import java.applet.*;

/* <applet code="dinerect.class" width="300" height="200"> </applet>
*/

public class dinerect extends Applet
{
public void paint(Graphics g)
{
g.drawLine(10, 10, 50, 50);

    g.drawRect(10, 60, 40, 30);
    g.fillRect(60, 10, 30, 80);

    g.drawRoundRect(10, 100, 80, 50, 10, 10);
    g.fillRoundRect(20, 110, 60, 30, 5, 5);

    g.drawLine(100, 10, 230, 140);
    g.drawLine(100, 140, 230, 10);
}


}
/*result: drawing line and rectangle using apllet is successfully executed*/
