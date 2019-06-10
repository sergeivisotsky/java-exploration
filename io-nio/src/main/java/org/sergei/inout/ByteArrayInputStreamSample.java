package org.sergei.inout;

import java.io.ByteArrayInputStream;

/**
 * @author Sergei Visotsky
 */
public class ByteArrayInputStreamSample {

    public static void main(String[] args) {

        String text = "Hello world!";
        byte[] bytes = text.getBytes();

        try(var bais = new ByteArrayInputStream(bytes)) {

            int sym;
            while ((sym = bais.read()) != -1) {
                System.out.println((char) sym);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
