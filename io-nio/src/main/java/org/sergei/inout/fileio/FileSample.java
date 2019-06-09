package org.sergei.inout.fileio;

import java.io.*;

/**
 * @author Sergei Visotsky
 */
public class FileSample {

    public static void main(String[] args) {

        var file = new File("io-nio/src/resources/files/hello.txt");
        try(var fileReader = new FileReader(file);
            var bufferedReader = new BufferedReader(fileReader)) {

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
