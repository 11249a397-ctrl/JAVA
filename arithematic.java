/*
Aim

To write and execute a Java program to demonstrate the use of packages by creating separate packages for addition, subtraction, multiplication, and division operations.

Algorithm
Start the program.
Create a package add and define the Add class with an addition() method.
Create a package sub and define the Sub class with a subtraction() method.
Create a package mul and define the Mul class with a multiplication() method.
Create a package div and define the Div class with a division() method.
Import all four classes into the Main class.
Create objects of Add, Sub, Mul, and Div.
Call the respective methods using the objects.
Display the results of all arithmetic operations.
Stop the program.*/

PROGRAM:
package add;

public class Add {
    public int addition(int a, int b) {
        return a + b;
    }
}

package div;

public class Div {
    public int division(int a, int b) {
        return a / b;
    }
}

import add.Add;
import sub.Sub;
import mul.Mul;
import div.Div;



package mul;

public class Mul {
    public int multiplication(int a, int b) {
        return a * b;
    }
}

package sub;

public class Sub {
    public int subtraction(int a, int b) {
        return a - b;
    }
}
public class Main {
    public static void main(String[] args) {

        Add a = new Add();
        Sub s = new Sub();
        Mul m = new Mul();
        Div d = new Div();

        System.out.println("Addition: " + a.addition(20, 10));
        System.out.println("Subtraction: " + s.subtraction(20, 10));
        System.out.println("Multiplication: " + m.multiplication(20, 10));
        System.out.println("Division: " + d.division(20, 10));
    }
}
/*Output
Addition: 30
Subtraction: 10
Multiplication: 200
Division: 2
Result

Thus, the Java program was successfully executed to demonstrate packages in Java by performing addition, subtraction, multiplication, and division using separate packages.*/
