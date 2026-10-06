/*FIBONACCI SERIES
Aim

To write and execute a Java program to generate the Fibonacci series for a given number of terms.

Algorithm
Start the program.
Import the Scanner class.
Read the number of terms n from the user.
Initialize a = 0 and b = 1.
Repeat the following steps n times:
Display the value of a.
Calculate c = a + b.
Assign a = b.
Assign b = c.
Display the Fibonacci series.
Stop the program.*/

PROGRAM:
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }
}
/*
Output
Enter number of terms: 8
Fibonacci Series:
0 1 1 2 3 5 8 13
Result

Thus, the Java program was successfully executed to generate the Fibonacci series for the given number of terms.*/
