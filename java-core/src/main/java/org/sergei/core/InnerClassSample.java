package org.sergei.core;

/**
 * @author Sergei Visotsky
 */
public class InnerClassSample {

    private static int a = 5;

    static class InnerClass {
        int b = a;
    }

    public static void main(String[] args) {
    }

}
