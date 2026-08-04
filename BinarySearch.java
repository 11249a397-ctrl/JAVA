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