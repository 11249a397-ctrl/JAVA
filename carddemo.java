/*
AIM

To write a Java program to demonstrate the CardLayout manager for displaying one component at a time.

ALGORITHM

Start the program.

Import the required Java AWT package.

Create a frame and set the CardLayout manager.

Create components such as buttons or panels.

Add the components to the frame with different card names.

Use CardLayout methods to display the required card.

Set the size of the frame and make it visible.

Stop the program.
*/
 progrm 
   import java.io.*; 
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="carddemo" width=250 height=150>
</applet>
*/
public class carddemo extends Applet implements ActionListener
{
Button b1,b2,b3,b4; Panel
buttonPanel;
CardLayout buttonCardLayout;
public void init()
{
buttonPanel=new Panel();
add(buttonPanel);
buttonCardLayout=new CardLayout();
buttonPanel.setLayout(buttonCardLayout);
b1=new Button("first Button");
b1.addActionListener(this);
buttonPanel.add(b1,"first Button");
b2=new Button("second Button");
b2.addActionListener(this);
buttonPanel.add(b2,"second Button");
b3=new Button("third button");
b3.addActionListener(this);
buttonPanel.add(b3,"third Button");
}
public void actionPerformed(ActionEvent e)
{
buttonCardLayout.next(buttonPanel);
}
}
/*RESULT

Thus, the Java program to demonstrate the CardLayout manager was executed successfully.*/
