package org.sergei.core;

/**
 * @author Sergei Visotsky
 */
public class NullComparison {

    public static void main(String[] args) {

        Integer a = null;
        Integer b = null;

        System.out.println(a = b);
        System.out.println(a.equals(b));
        System.out.println(!a.equals(b));

    }

}
