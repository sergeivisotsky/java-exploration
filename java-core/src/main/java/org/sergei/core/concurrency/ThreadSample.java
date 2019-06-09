package org.sergei.core.concurrency;

/**
 * @author Sergei Visotsky
 */
public class ThreadSample extends Thread {

    private String animalName;
    private String animalType;

    public ThreadSample(String animalType, String animalName) {
        this.animalType = animalType;
        this.animalName = animalName;
        System.out.println("Concurrently creating " + animalType + " with name " + animalName + ")))");
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Producing " + i + " " + animalType + " with name " + animalName + ")))");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Releasing " + animalType + " with name " +
                            animalName + " in production environment (e.g. ZOO) :D");
    }

    public static void main(String[] args) {
        ThreadSample animalOne = new ThreadSample("cat" , "Doggie");
        animalOne.start();

        ThreadSample animalTwo = new ThreadSample("dog", "Jim");
        animalTwo.start();

        ThreadSample animalThree = new ThreadSample("tiger", "Tygur");
        animalThree.start();
    }
}
