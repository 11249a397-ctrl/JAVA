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