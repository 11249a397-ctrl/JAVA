/*
LEAP YEAR
Aim

To write and execute a Java program to check whether a given year is a leap year or not.

Algorithm
Start the program.
Import the Scanner class.
Read the year from the user.
Check if the year is divisible by 400.
If yes, it is a leap year.
Otherwise, check if the year is divisible by 100.
If yes, it is not a leap year.
Otherwise, check if the year is divisible by 4.
If yes, it is a leap year.
Otherwise, it is not a leap year.
Display the result.
Stop the program.*/

PROGRAM:
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter any year: ");
        int year = s.nextInt();

        boolean flag = false;

        if (year % 400 == 0) {
            flag = true;
        } else if (year % 100 == 0) {
            flag = false;
        } else if (year % 4 == 0) {
            flag = true;
        } else {
            flag = false;
        }

        if (flag) {
            System.out.println("Year " + year + " is a Leap Year");
        } else {
            System.out.println("Year " + year + " is not a Leap Year");
        }

        s.close();
    }
}
/*
Output
Example 1
Enter any year: 2024
Year 2024 is a Leap Year
Example 2
Enter any year: 2023
Year 2023 is not a Leap Year
Result

Thus, the Java program was successfully executed to check whether the given year is a leap year or not.*/
