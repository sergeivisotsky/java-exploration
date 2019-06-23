package org.sergei.core.concurrency;

/**
 * @author Sergei Visotsky
 */
class Counter {

    private int counter;

    synchronized void increment() {
        counter++;
    }

    int getCounter() {
        return counter;
    }
}

public class BrightSynchronizedSample {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t1.join(); // Ask current thread wait until t1 completes execution

        t2.start();
        t2.join(); // Ask current thread wait until t1 completes execution

        System.out.println("Total counted: " + counter.getCounter());

    }

}
