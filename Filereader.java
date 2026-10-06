/*FILE READER USING FILEREADER
Aim

To write and execute a Java program to read and display the contents of a text file using the FileReader class.

Algorithm
Start the program.
Import the java.io.* package.
Create a FileReader object to open the file sample2.txt.
Declare an integer variable i to store each character read from the file.
Read the file character by character using the read() method.
Continue reading until read() returns -1, which indicates the end of the file.
Convert each integer value into a character and display it.
Close the file using the close() method.
If an exception occurs, display the exception message.
Stop the program.*/

PROGRAM:
import java.io.*; 
class Filereader
{
public static void main(String[]args)
{
try
{
FileReader fr=new FileReader("sample2.txt");
 int i;
while((i=fr.read())!=-1)
{
System.out.println((char)i);
}
fr.close();
}
catch(Exception e)
{
System.out.println("Exception:"+e);
}
}
}
/*
Output

If sample2.txt contains:

Welcome to Java
File handling is easy
 W
e
l
c
o
m
e
 
t
o
 
J
a
v
a

F
i
l
e
 
h
a
n
d
l
i
n
g
 
i
s
 
e
a
s
y
 Result

Thus, the Java program was successfully executed to read and display the contents of a text file using the FileReader class.*/
