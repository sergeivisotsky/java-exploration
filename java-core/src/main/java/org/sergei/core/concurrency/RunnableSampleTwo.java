package org.sergei.core.concurrency;

/**
 * @author Sergei Visotsky
 */
public class RunnableSampleTwo implements Runnable {

    private String hello;
    private String bye;

    public RunnableSampleTwo(String hello, String bye) {
        this.hello = hello;
        this.bye = bye;
        System.out.println("Please say hello: " + hello);
        System.out.println("Please say bye: " + bye);
    }

    @Override
    public void run() {
        System.out.println("Thead starts and saying 'Hello!' - " + hello);

        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Producing thread for the: " + i + " time");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Exiting out of the thread and saying 'Bye!' - " + bye);
    }

    public static void main(String[] args) {

        RunnableSampleTwo thread1 = new RunnableSampleTwo("Hello 1!)))", "Bye 1!)))");
        thread1.run();

        RunnableSampleTwo thread2 = new RunnableSampleTwo("Hello 2!)))", "Bye 2!)))");
        thread2.run();

        RunnableSampleTwo thread3 = new RunnableSampleTwo("Hello 3!)))", "Bye 3!)))");
        thread3.run();
    }

}
