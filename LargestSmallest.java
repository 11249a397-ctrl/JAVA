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