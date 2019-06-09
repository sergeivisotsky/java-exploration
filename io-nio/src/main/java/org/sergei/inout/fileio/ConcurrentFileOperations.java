package org.sergei.inout.fileio;

import java.io.*;

/**
 * @author Sergei Visotsky
 */

class ReadConcurrently implements Runnable {

    private String filePath;

    public ReadConcurrently(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {
        var file = new File(filePath);

        try(var fr = new FileReader(file);
            var br = new BufferedReader(fr)) {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Read file: " + i + " time");
                String line;
                Thread.sleep(2000);
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class WriteConcurrently implements Runnable {

    private String filePath;
    private String text;

    public WriteConcurrently(String filePath, String text) {
        this.filePath = filePath;
        this.text = text;
    }

    @Override
    public void run() {
        byte[] buffer = text.getBytes();

        try(FileOutputStream fos = new FileOutputStream(filePath)) {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Write into the file " + i + " time");
                Thread.sleep(100);
                fos.write(buffer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class ConcurrentFileOperations {

    public static void main(String[] args) {
        var path = "io-nio/src/main/resources/files/conc_file.txt";
        var text = "This is a test...";

        var reader = new ReadConcurrently(path);
        reader.run();

        var writer = new WriteConcurrently(path, text);
        writer.run();
    }

}
