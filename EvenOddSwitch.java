/*EVEN AND ODD NUMBER USING SWITCH CASE
Aim

To write and execute a Java program to check whether a given number is even or odd using a switch statement.

Algorithm
Start the program.
Import the Scanner class.
Read a number n from the user.
Find the remainder using n % 2.
Use a switch statement:
If the remainder is 0, the number is even.
If the remainder is 1 or -1, the number is odd.
Display the result.
Stop the program.*/
PROGRAM:
import java.util.Scanner;

public class EvenOddSwitch {
    public static void main(String[] args) {

        int n;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = s.nextInt();

        switch (n % 2) {
            case 0:
                System.out.println("This number is even");
                break;

            case 1:
            case -1:
                System.out.println("This number is odd");
                break;

            default:
                System.out.println("Invalid input");
        }

        s.close();
    }
}
/*
OUTPUT:
Enter a number: 24
This number is even
Another Example
Enter a number: 15
This number is odd

RESULT:
Thus, the Java program was successfully executed to determine whether the given number is even or odd using a switch statement.*/
