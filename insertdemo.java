/*
AIM

To write a Java program to demonstrate the BorderLayout manager for arranging components in five regions: North, South, East, West, and Center.

ALGORITHM

Start the program.

Import the required Java AWT package.

Create a frame.

Set the layout of the frame using BorderLayout.

Create five components such as buttons.

Add the components to the North, South, East, West, and Center regions.

Set the size of the frame and make it visible.

Stop the program.
*/
program
  
import java.awt.*;
import java.applet.*;
import java.io.*;
import java.util.*;
/*
<applet code="insertdemo" width=400 height=200>
</applet>
*/
public class insertdemo extends Applet
{
public void init()
{
setBackground(Color.cyan);
setLayout(new BorderLayout());
add(new Button("this is cross the top"),BorderLayout.NORTH);
add(new Button("the footer messsage might go here"),BorderLayout.SOUTH);
add(new Button("RIGHT"),BorderLayout.EAST);
add(new Button("LEFT"),BorderLayout.WEST);
String msg="the reasonable man adapts\n\n";
add(new TextArea(msg),BorderLayout.CENTER);
}
public Insets getInsets()
{
return new Insets(10,10,10,10);
}
}

/*result
Thus, the Java program to demonstrate the BorderLayout manager was executed successfully.*/
