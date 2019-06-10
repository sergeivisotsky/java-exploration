package org.sergei.inout;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Sergei Visotsky
 */
public class ByteArrayOutputStreamSample {

    public static void main(String[] args) {

        String text = "Hello world!";
        byte[] bytes = text.getBytes();

        var baos = new ByteArrayOutputStream();

        try {
            baos.write(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(baos.toString());
        System.out.println(Arrays.toString(baos.toByteArray()));

    }

}
