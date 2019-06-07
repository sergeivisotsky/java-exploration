package org.sergei.core.abstraction;

/**
 * @author Sergei Visotsky
 */
public abstract class Actions {
    
    private String hello;
    
    public Actions(String hello) {
        this.hello = hello;
    }

    public void metOne() {
        System.out.println("Method one");
    }
    
    public void metTwo() {
        System.out.println("Method two");
    }
    
    public void metThree() {
        System.out.println("Method three");
    }
    
    public String hello() {
        return hello;
    }
    
    public abstract void metImpl();
}
