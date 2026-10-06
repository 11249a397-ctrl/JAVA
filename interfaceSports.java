/*MULTIPLE INHERITANCE USING INTERFACES
Aim

To write and execute a Java program to demonstrate multiple inheritance using interfaces by implementing two interfaces in a single class.

Algorithm
Start the program.
Create an interface Sports with the method play().
Create an interface Academics with the method study().
Create a class Student that implements both Sports and Academics.
Define the play() method to display the sports message.
Define the study() method to display the study message.
Create an object of the Student class.
Call the play() and study() methods.
Display the output.
Stop the program.*/

PROGRAM:
interface Sports {
    void play();
}

interface Academics {
    void study();
}

class Student implements Sports, Academics {
    public void play() {
        System.out.println("Student plays sports");
    }

    public void study() {
        System.out.println("Student studies");
    }
}

public class interfaceSports {
    public static void main(String[] args) {
        Student s = new Student();
        s.play();
        s.study();
    }
}
/*
Output
Student plays sports
Student studies
Result

Thus, the Java program was successfully executed to demonstrate multiple inheritance using interfaces, where the Student class implements both Sports and Academics interfaces.*/
