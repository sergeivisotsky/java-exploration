package org.sergei.core;

/**
 * @author Sergei Visotsky
 */
enum Fruits {
    apple(5), orange(10), pineapple(23), grape(90);

    private int price;
    
    private Fruits(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class Enumeration {

    public static void main(String[] args) {
        
        Fruits appleFruit = Fruits.apple;
        System.out.println(appleFruit.getPrice());
        
    }
    
}
