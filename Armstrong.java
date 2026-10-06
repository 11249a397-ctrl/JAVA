/*Aim

To write and execute a Java program to check whether a given number is an Armstrong number or not.

Algorithm
Start the program.
Import the Scanner class.
Read a number n from the user.
Store the original number in original.
Initialize sum = 0.
Repeat while n > 0:
Find the last digit using n % 10.
Find the cube of the digit.
Add the cube to sum.
Remove the last digit using n / 10.
Compare sum with the original number.
If both are equal, display Armstrong number.
Otherwise, display not an Armstrong number.
Stop the program.import java.util.Scanner;*/

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + (digit * digit * digit);
            n = n / 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }
    }
}
/*Output
Example 1
Enter a number: 153
153 is an Armstrong number
Example 2
Enter a number: 123
123 is not an Armstrong number

Result:
Thus, the Java program was successfully executed to check whether the given number is an Armstrong number or not.*/
