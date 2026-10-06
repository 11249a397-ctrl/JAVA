/*STUDENTS SCORING 60 OR ABOVE
Aim

To write and execute a Java program to read the names and marks of six students and display the students who scored 60 or above.

Algorithm
Start the program.
Import the Scanner class.
Create two arrays to store the names and marks of 6 students.
Read the name and marks of each student using a for loop.
Traverse the marks array using another for loop.
Check whether each student's marks are greater than or equal to 60.
If the marks are 60 or above, display the student's name and marks.
Close the scanner.
Stop the program.*/

PROOGRAM:
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
/*
Output
Enter Name of Student 1: Anu
Enter Marks of Student 1: 75
Enter Name of Student 2: Ravi
Enter Marks of Student 2: 55
Enter Name of Student 3: Priya
Enter Marks of Student 3: 82
Enter Name of Student 4: Arun
Enter Marks of Student 4: 45
Enter Name of Student 5: Meena
Enter Marks of Student 5: 68
Enter Name of Student 6: Rahul
Enter Marks of Student 6: 50

Students Scoring 60 or Above:
Anu 75
Priya 82
Meena 68
Result

Thus, the Java program was successfully executed to display the names and marks of students who scored 60 or above.*/
