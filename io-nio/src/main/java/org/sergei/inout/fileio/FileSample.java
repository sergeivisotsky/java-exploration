package org.sergei.inout.fileio;

import java.io.*;

/**
 * @author Sergei Visotsky
 */
public class FileSample {

    public static void main(String[] args) {

        var file = new File("io-nio/src/resources/files/hello.txt");
        try(var fr = new FileReader(file);
            var br = new BufferedReader(fr)) {

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
