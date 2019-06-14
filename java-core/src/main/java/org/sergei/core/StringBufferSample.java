package org.sergei.core;

/**
 * @author Sergei Visotsky
 */
public class StringBufferSample {

    public static void main(String[] args) {

        StringBuilder builder1 = new StringBuilder();
        for (int i = 0; i <= 32; i++) {
            builder1.append(i);
        }
        System.out.println("Buffer1 current length (32 + 16): " + builder1.length());
        System.out.println("Buffer 2 capacity (total with allocated): " + builder1.capacity());

        StringBuilder builder2 = new StringBuilder(10);
        for (int i = 0; i <= 56; i++) {
            builder2.append(i);
        }
        System.out.println("Buffer2 current length: " + builder2.length());
        System.out.println("Buffer2 capacity (total + allocated): " + builder2.capacity());

        StringBuilder builder3 = new StringBuilder();
        builder3.ensureCapacity(5);
        builder3.setLength(7);
        for (int i = 0; i < 3; i++) {
            builder3.append(i);
        }
        System.out.println();

        // TODO: To be continued...

    }

}
