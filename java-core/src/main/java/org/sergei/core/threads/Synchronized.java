package org.sergei.core.threads;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergei Visotsky
 */
class ListWriter {

    private final List<String> elements;

    ListWriter() {
        elements = new ArrayList<>();
    }

    void write(String message) {
        try {
            Thread.sleep(3000);
            for (int i = 0; i < 30; i++) {
                elements.add(message);
            }
            elements.forEach(System.out::println);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ListWriterWrite extends Thread {

    private String message;
    private final ListWriter writer;

    ListWriterWrite(String message, ListWriter writer) {
        this.message = message;
        this.writer = writer;
    }

    @Override
    public void run() {
        synchronized (writer) {
            writer.write(message);
        }
    }
}

public class Synchronized {

    public static void main(String[] args) {
        ListWriter writer = new ListWriter();

        ListWriterWrite writeOne = new ListWriterWrite("Hello one", writer);
        ListWriterWrite writeTwo = new ListWriterWrite("Hello two", writer);

        writeOne.start();
        writeTwo.start();

        try {
            writeOne.join();
            writeTwo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
