package org.sergei.core.primitives;

/**
 * @author Sergei Visotsky
 */
public class ByteShortSample {

    public static void main(String[] args) {

        byte b = (byte) 'b';
        b++;
        short s = b;
        System.out.println(s - 1);

    }

}
