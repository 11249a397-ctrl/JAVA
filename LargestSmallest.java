/*
LARGEST AND SMALLEST ELEMENT IN AN ARRAY
Aim

To write and execute a Java program to find the largest and smallest elements in an array.

Algorithm
Start the program.
Import the Scanner class.
Read the number of elements n.
Create an integer array of size n.
Read the array elements from the user.
Initialize largest and smallest with the first array element.
Compare each remaining element with largest.
If the element is greater, update largest.
Compare each remaining element with smallest.
If the element is smaller, update smallest.
Display the largest and smallest numbers.
Stop the program.*/
PROGRAM:
import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i;

        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the array elements:");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int largest = a[0];
        int smallest = a[0];

        for (i = 1; i < n; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }

            if (a[i] < smallest) {
                smallest = a[i];
            }
        }

        System.out.println("Largest Number = " + largest);
        System.out.println("Smallest Number = " + smallest);

        sc.close();
    }
}
/*
Output
Enter the number of elements: 5
Enter the array elements:
25
10
45
5
30

Largest Number = 45
Smallest Number = 5
Result

Thus, the Java program was successfully executed to find the largest and smallest elements in the given array.*/
