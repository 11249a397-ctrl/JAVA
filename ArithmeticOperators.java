/*Aim

To write and execute a Java program to perform arithmetic operations such as addition, subtraction, multiplication, division, and modulus using a menu-driven program.

Algorithm
Start the program.
Import the Scanner class to read input from the user.
Create a Scanner object.
Read two integer numbers x and y.
Display the menu containing:
Addition
Subtraction
Multiplication
Division
Modulus
Exit
Read the user's choice.
Use a switch statement to perform the selected operation.
For division and modulus, check whether the second number is zero.
Display the calculated result.
If the user selects Exit, close the scanner and terminate the program.
Repeat the process until the user chooses Exit.
Stop the program.*/
    
PROGRAM:
import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while (true) {

            System.out.println();
            System.out.println("Enter the two numbers to perform operations");

            System.out.print("Enter the first number: ");
            int x = s.nextInt();

            System.out.print("Enter the second number: ");
            int y = s.nextInt();

            System.out.println("\nChoose the operation you want to perform");
            System.out.println("1. ADDITION");
            System.out.println("2. SUBTRACTION");
            System.out.println("3. MULTIPLICATION");
            System.out.println("4. DIVISION");
            System.out.println("5. MODULUS");
            System.out.println("6. EXIT");

            System.out.print("Enter your choice: ");
            int n = s.nextInt();

            switch (n) {
                case 1:
                    int add = x + y;
                    System.out.println("Result: " + add);
                    break;

                case 2:
                    int sub = x - y;
                    System.out.println("Result: " + sub);
                    break;

                case 3:
                    int mul = x * y;
                    System.out.println("Result: " + mul);
                    break;

                case 4:
                    if (y != 0) {
                        float div = (float) x / y;
                        System.out.println("Result: " + div);
                    } else {
                        System.out.println("Division by zero is not possible.");
                    }
                    break;

                case 5:
                    if (y != 0) {
                        int mod = x % y;
                        System.out.println("Result: " + mod);
                    } else {
                        System.out.println("Modulus by zero is not possible.");
                    }
                    break;

                case 6:
                    System.out.println("Program Exited.");
                    s.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}

/*OUTPUT:
Enter the two numbers to perform operations
Enter the first number: 20
Enter the second number: 5

Choose the operation you want to perform
1. ADDITION
2. SUBTRACTION
3. MULTIPLICATION
4. DIVISION
5. MODULUS
6. EXIT

Enter your choice: 1
Result: 25

RESULT:
Thus, the Java program was successfully executed to perform addition, subtraction, multiplication, division, and modulus operations using a menu-driven approach.*/
