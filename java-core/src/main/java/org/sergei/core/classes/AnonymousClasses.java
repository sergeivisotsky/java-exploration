package org.sergei.core.classes;

abstract class AnanymoutInner {
    abstract void print();
}

public class AnonymousClasses {

    public static void main(String[] args) {
        AnanymoutInner ai = new AnanymoutInner() {
            @Override
            void print() {
                System.out.println("Hello world!");
            }
        };
        
        ai.print();
    }
    
}
