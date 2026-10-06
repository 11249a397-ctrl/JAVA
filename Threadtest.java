/*THREAD METHODS – YIELD() AND SLEEP()
Aim

To write and execute a Java program to demonstrate multithreading using yield() and sleep() methods.

Algorithm
Start the program.
Create three classes A, B, and C by extending the Thread class.
In thread A, use the yield() method to give other threads a chance to execute.
In thread B, display the values from 1 to 3 and terminate the loop using break when j = 3.
In thread C, display the values from 1 to 5.
When k = 1, pause thread C for 1500 milliseconds using Thread.sleep().
Create objects for all three threads.
Start the three threads using the start() method.
Display the main thread exit message.
Stop the program.*/

PROGRAM:
class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                Thread.yield();
            }

            System.out.println("from thread A i=" + i);
        }

        System.out.println("exit from A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("from thread B j=" + j);

            if (j == 3) {
                System.out.println("exit from B");
                break;
            }
        }
    }
}

class C extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("thread C = " + k);

            if (k == 1) {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    System.out.println("Thread C interrupted");
                }
            }
        }
    }
}

public class Threadtest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        System.out.println("Start thread A");

        a.start();
        b.start();
        c.start();

        System.out.println("exit from main thread");
    }
}
/*
Output

Note: The order may change each time because the three threads execute concurrently.

One possible output is:

Start thread A
exit from main thread
from thread B j=1
from thread B j=2
from thread B j=3
exit from B
thread C = 1
from thread A i=1
from thread A i=2
from thread A i=3
from thread A i=4
from thread A i=5
exit from A
thread C = 2
thread C = 3
thread C = 4
thread C = 5
Result

Thus, the Java program was successfully executed to demonstrate multithreading using the yield() and sleep() methods.*/


