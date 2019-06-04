package org.sergei.inout;

import java.io.PrintWriter;

public class PrintWriterSample {

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("Hello world!");
    }

}
