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