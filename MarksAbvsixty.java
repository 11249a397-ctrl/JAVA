import java.util.Scanner;

public class MarksAbvsixty {
    public static void main(String[] args) {

        int[] marks = new int[6];
        String[] name = new String[6];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            name[i] = scanner.next();

            System.out.print("Enter Marks of Student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        System.out.println("\nStudents Scoring 60 or Above:");

        for (int i = 0; i < 6; i++) {
            if (marks[i] >= 60) {
                System.out.println(name[i] + " " + marks[i]);
            }
        }

        scanner.close();
    }
}