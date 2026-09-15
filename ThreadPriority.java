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

