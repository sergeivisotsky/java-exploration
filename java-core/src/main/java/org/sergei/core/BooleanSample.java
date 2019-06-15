package org.sergei.core;

/**
 * @author Sergei Visotsky
 */
public class BooleanSample {

    static boolean x;
    static boolean y;

    public static void main(String[] args) {
        x = x || y && !x;
        y = y && x || y;
        System.out.println(x);
        System.out.println(y);
    }

}
