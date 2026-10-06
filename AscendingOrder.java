/*Aim

To write and execute a Java program to arrange the elements of an array in ascending order.

Algorithm
Start the program.
Import the Scanner class.
Read the number of elements n.
Create an integer array of size n.
Read the array elements from the user.
Compare each element with the remaining elements using nested for loops.
If the first element is greater than the second element, swap them using a temporary variable.
Repeat the comparison until all elements are arranged in ascending order.
Display the sorted array.
Stop the program.*/
    
import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, temp;

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the array elements:");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }


        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("Array in Ascending Order:");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}
/*Output
Enter the number of elements: 5
Enter the array elements:
50
20
40
10
30

Array in Ascending Order:
10 20 30 40 50
Result

Thus, the Java program was successfully executed to sort the given array elements in ascending order.*/
