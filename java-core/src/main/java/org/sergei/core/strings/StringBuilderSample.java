package org.sergei.core.strings;

/**
 * @author Sergei Visotsky
 */
public class StringBuilderSample {

    public static void main(String[] args) {

        StringBuilder builder1 = new StringBuilder();
        builder1.append("Hello ")
                .append("world ")
                .append("world ")
                .append("Java ")
                .append("and Spring");
        System.out.println("The result of builder1: " + builder1.toString());
        System.out.println("Buffer1 current length: " + builder1.length());
        System.out.println("Buffer1 capacity (total with allocated | 24 + 16): " + builder1.capacity());

        StringBuilder builder2 = new StringBuilder(10);
        builder2.append("Hello ")
                .append("Java ")
                .append("world");
        System.out.println("The result of builder2: " + builder2.toString());
        System.out.println("Buffer2 current length: " + builder2.length());
        System.out.println("Buffer2 capacity (total + allocated): " + builder2.capacity());

        StringBuilder builder3 = new StringBuilder();
        builder3.ensureCapacity(5);
        builder3.setLength(7);
        builder3.append("Hello ")
                .append("world ")
                .append("Java ")
                .append("and Spring");
        System.out.println("The result of builder3: " + builder3.toString());
        System.out.println("Buffer3 current length: " + builder3.length());
        System.out.println("Buffer3 capacity (total + allocated): " + builder3.capacity());

        // TODO: To be continued...

    }

}
