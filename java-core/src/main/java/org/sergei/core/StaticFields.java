package org.sergei.core;

/**
 * @author Sergei Visotsky
 */
public class StaticFields {

    private static int a; //the value of static field is always 0 if it is not initialized

    public static void main(String[] args) {
        System.out.println(a);
    }

}
