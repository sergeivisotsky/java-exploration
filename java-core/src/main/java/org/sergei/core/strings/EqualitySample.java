package org.sergei.core.strings;

/**
 * @author Sergei Visotsky
 */
public class EqualitySample {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "HELLO";

        System.out.println("s1 equal to s2: " + s1.equals(s2)); // true - equals
        System.out.println("s1 not equal to s2: " + s1.equals(s3)); // false - not equals
        System.out.println("s1 equals to s3: " + s1.equalsIgnoreCase(s3)); // true - case is ignored!

    }

}
