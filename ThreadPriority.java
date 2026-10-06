/*
THREAD METHODS – YIELD(), SLEEP() AND THREAD EXECUTION
Aim

To write and execute a Java program to demonstrate thread execution using yield() and sleep() methods.

Algorithm
Start the program.
Create three classes A, B, and C extending the Thread class.
In thread A, use the yield() method to temporarily give other threads a chance to execute.
In thread B, display the values and stop the thread when j becomes 3 using break.
In thread C, use the sleep(1500) method to pause the thread for 1500 milliseconds.
Create objects a, b, and c for the three threads.
Start all three threads using the start() method.
Display the messages produced by the threads.
The main thread displays its exit message.
Stop the program.*/

PROGRAM:
class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 1)
                yield();

            System.out.println("From thread A i = " + i);
        }

        System.out.println("Exit from A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("From thread B j = " + j);

            if (j == 3) {
                System.out.println("Exit from B");
                break;
            }
        }
    }
}

class C extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("Thread C = " + k);

            if (k == 1) {
                try {
                    sleep(1500);
                } catch (InterruptedException e) {
                    System.out.println("Thread C interrupted");
                }
            }
        }

        System.out.println("Exit from C");
    }
}

class Threadtest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        System.out.println("Start thread A");

        a.start();
        b.start();
        c.start();

        System.out.println("Exit from main thread");
    }
}
/*
Output

Note: The exact order of output may change because thread execution depends on the thread scheduler.

One possible output is:

Start thread A
Exit from main thread
From thread B j = 1
From thread B j = 2
From thread B j = 3
Exit from B
Thread C = 1
From thread A i = 1
From thread A i = 2
From thread A i = 3
From thread A i = 4
From thread A i = 5
Exit from A
Thread C = 2
Thread C = 3
Thread C = 4
Thread C = 5
Exit from C
Result

Thus, the Java program was successfully executed to demonstrate multithreading using yield() and sleep() methods, along with concurrent execution of multiple threads.*/
