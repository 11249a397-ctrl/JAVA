/*FILE WRITER USING FILEWRITER
Aim

To write and execute a Java program to write characters into a text file using the FileWriter class.

Algorithm
Start the program.
Import the java.io.* package.
Create a FileWriter object for the file sample2.txt.
Use a for loop from ASCII value 65 to 90.
Write each character into the file using the write() method.
Close the file using the close() method.
If an exception occurs, display the exception message.
Stop the program.*/

PROGRAM:
import java.io.*; 
class Filewriter
{
public static void main(String[]args)
{
try
{
FileWriter fw= new FileWriter("sample2.txt"); 
for(char i=65;i<91;i++)
{
fw.write(i);
}
fw.close();
}
catch(Exception e)
{
System.out.println("Exception :"+e);
}
}
}
/*
Output

The program does not display anything on the screen if it executes successfully.

The file sample2.txt will contain:

ABCDEFGHIJKLMNOPQRSTUVWXYZ
Result

Thus, the Java program was successfully executed to write the uppercase English alphabets into a text file using the FileWriter class.*/
