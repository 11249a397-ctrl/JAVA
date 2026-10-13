/*
AIM

To write a Java program to demonstrate the GridLayout manager for arranging components in rows and columns.

ALGORITHM

Start the program.

Import the required Java AWT package.

Create a class that extends the Frame class.

Set the layout using GridLayout with the required number of rows and columns.

Create buttons or other components.

Add the components to the frame.

Set the size of the frame and make it visible.

Stop the program.
*/
program
  import java.awt.*;
import java.io.*;
import java.applet.Applet.*;
import java.applet.*;
/*<applet code="gld.class" height=300 width=300>
</applet>*/

public class gld extends Applet
{
public void init()
{ 
setLayout(new GridLayout(5,2));
Button b1=new Button("A");
Button b2=new Button("B");
Button b3=new Button("C");
Button b4=new Button("D");
Button b5=new Button("E");
Button b6=new Button("F");
Button b7=new Button("G");
Button b8=new Button("H");
Button b9=new Button("I");
Button b10=new Button("J");
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
add(b10);
}
public Insets getInsets()
{
return new Insets(20,20,20,20);
}}

/*result: grid layout successfully excecuted*/
