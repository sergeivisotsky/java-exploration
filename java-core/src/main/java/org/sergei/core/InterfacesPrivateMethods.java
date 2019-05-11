package org.sergei.core;

interface IHello {
    
    default void printHello(String text) {
        System.out.println(hello(text));
    }
    
    private String hello(String text) {
        return text;
    }
}

public class InterfacesPrivateMethods implements IHello {

    @Override
    public void printHello(String text) {
        IHello.super.printHello(text);
    }

    public static void main(String[] args) {
        
    }
    
}
