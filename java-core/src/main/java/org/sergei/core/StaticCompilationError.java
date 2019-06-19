package org.sergei.core;

/**
 * @author Sergei Visotsky
 */
public class StaticCompilationError {

    static int number;
    String text;

    void methodA() {
        System.out.println(this.number);
        System.out.println(this.text);
    }

    void methodB() {
        System.out.println(this.number);
        System.out.println(this.text);
    }

    public static void main(String[] args) {
        StaticCompilationError error = new StaticCompilationError();
        error.methodA();
        error.methodB();
    }

}
