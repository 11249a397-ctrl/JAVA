/*
MULTITHREADING USING THREAD CLASS
Aim

To write and execute a Java program to demonstrate multithreading by creating and running multiple threads using the Thread class.

Algorithm
Start the program.
Create a class MyThread that extends the Thread class.
Override the run() method.
Use a for loop to print the thread execution five times.
Use Thread.sleep(500) to pause the thread for 500 milliseconds.
Create two thread objects t1 and t2.
Start both threads using the start() method.
Both threads execute concurrently.
Display the thread execution messages.
Stop the program
    */

PROGRAM:
class MyThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Main1 {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();
    }
}
/*
Output

The output order may vary because both threads run concurrently.

Thread is running: 1
Thread is running: 1
Thread is running: 2
Thread is running: 2
Thread is running: 3
Thread is running: 3
Thread is running: 4
Thread is running: 4
Thread is running: 5
Thread is running: 5

Note: The order can be different each time because of thread scheduling.

Result

Thus, the Java program was successfully executed to demonstrate multithreading using the Thread class, where two threads execute concurrently.*/
