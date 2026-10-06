/*Aim

To write and execute a Java program to search for a given element in an array using the Binary Search technique.

Algorithm
Start the program.
Import the Scanner class.
Read the number of elements n.
Create an integer array of size n.
Read the array elements in ascending order.
Read the element x to be searched.
Set first = 0 and last = n - 1.
Repeat while first <= last:
Calculate mid = (first + last) / 2.
If a[mid] == x, the element is found.
If x < a[mid], search the left half by setting last = mid - 1.
Otherwise, search the right half by setting first = mid + 1.
If the element is not found, display "Element not found."
Stop the program.*/

PROGRAM:
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, i, x;
        int first, last, mid;
        boolean found = false;

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter elements in ascending order:");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        x = sc.nextInt();

        first = 0;
        last = n - 1;

        while (first <= last) {
            mid = (first + last) / 2;

            if (a[mid] == x) {
                System.out.println("Element found at position: " + (mid + 1));
                found = true;
                break;
            } else if (x < a[mid]) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}
/*
OUTPUT:
Example 1: Element Found
Enter number of elements: 5
Enter elements in ascending order:
10
20
30
40
50
Enter element to search: 30
Element found at position: 3
Example 2: Element Not Found
Enter number of elements: 5
Enter elements in ascending order:
10
20
30
40
50
Enter element to search: 25
Element not found.

RESULT:
Thus, the Java program was successfully executed to search for an element in a sorted array using the Binary Search technique.*/
