package org.sergei.core;

/**
 * @author Sergei Visotsky
 */
public class StringBoolean {

    public static void main(String[] args) {

        boolean b1 = new String("hello").equals("hello");
        System.out.printf("b1: %s\n", b1);
        boolean b2 = new StringBuilder("he").append("llo").equals(new StringBuilder("hello"));
        System.out.printf("b2: %s\n", b2);
        boolean b3 = new String(" hello ").strip().equalsIgnoreCase("hello");
        System.out.printf("b3: %s\n", b3);
        boolean b4 = ("he" + "llo").toUpperCase().equals("HELLO");
        System.out.printf("b4: %s\n", b4);
        boolean b5 = "heLLO".equalsIgnoreCase("HEllo");
        System.out.printf("b5: %s\n", b5);

    }

}
