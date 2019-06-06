package org.sergei.core.interfaces;

interface IHello {
    
    default void printHello(String text) {
        System.out.println(hello(text));
    }
    
    private String hello(String text) {
        return text;
    }
}

public class ExtendedInterfaces implements IHello {

    @Override
    public void printHello(String text) {
        IHello.super.printHello(text);
    }

    public static void main(String[] args) {
        ExtendedInterfaces interfaces = new ExtendedInterfaces();
        interfaces.printHello("Hello world!");
    }
    
}
