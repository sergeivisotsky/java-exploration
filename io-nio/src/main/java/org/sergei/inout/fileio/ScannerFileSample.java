package org.sergei.inout.fileio;

import java.io.File;
import java.util.Scanner;

/**
 * @author Sergei Visotsky
 */
public class ScannerFileSample {

    public static void main(String[] args) {
        var file = new File("io-nio/src/main/resources/files/hello.txt");
        try(Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
