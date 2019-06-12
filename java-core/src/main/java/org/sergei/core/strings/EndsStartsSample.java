package org.sergei.core.strings;

/**
 * @author Sergei Visotsky
 */
public class EndsStartsSample {

    public static void main(String[] args) {

        String hello = "Hello";
        System.out.println("Starts with lo: " + hello.startsWith("lo"));
        System.out.println("Starts with He: " + hello.startsWith("He"));
        System.out.println("Starts with ka: " + hello.endsWith("ka"));
        System.out.println("Ends with lo: " + hello.endsWith("lo"));

    }

}
