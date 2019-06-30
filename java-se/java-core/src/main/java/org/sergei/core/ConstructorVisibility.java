package org.sergei.core;

/**
 * @author Sergei Visotsky
 */
public class ConstructorVisibility {

    public ConstructorVisibility(String arg1, String arg2) {
        System.out.println("Two parameters");
//        this(arg1 + " " + arg2); // Fails to compile
    }

    public ConstructorVisibility(String arg) {
        System.out.println("One parameter");
        System.out.println(arg);
    }

    public static void main(String[] args) {
        new ConstructorVisibility("Foo", "Bar");
    }
}
