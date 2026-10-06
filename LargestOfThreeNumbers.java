/*
LARGEST OF THREE NUMBERS
Aim

To write and execute a Java program to find the largest among three given integers using if-else statements.

Algorithm
Start the program.
Import the Scanner class.
Declare three integer variables x, y, and z.
Read three numbers from the user.
Compare x with y and z.
If x is greater than both, display that the first number is largest.
Otherwise, compare y with x and z.
If y is greater than both, display that the second number is largest.
Otherwise, compare z with x and y.
If z is greater than both, display that the third number is largest.
If none of the conditions are satisfied, display that the numbers are not distinct.
Stop the program.*/
PROGRAM:
import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {

        int x, y, z;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter three integers:");

        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        if (x > y && x > z) {
            System.out.println("First number is largest.");
        } else if (y > x && y > z) {
            System.out.println("Second number is largest.");
        } else if (z > x && z > y) {
            System.out.println("Third number is largest.");
        } else {
            System.out.println("The numbers are not distinct.");
        }

        in.close();
    }
}
/*
Output
Enter three integers:
25
10
18
First number is largest.
Another Example
Enter three integers:
12
35
20
Second number is largest.
Result

Thus, the Java program was successfully executed to find the largest among three given numbers using conditional statements.*/
