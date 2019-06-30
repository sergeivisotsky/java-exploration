package org.sergei.core.classes;

/**
 * @author Sergei Visotsky
 */
interface IFunctional {
    void print();
}

interface IFunctionalDif {
    String print(String msg);
}

public class FunctionalInterface {

    public static void main(String[] args) {
        IFunctional iFunc = () -> {
          System.out.println("Hello world!");  
        };
        
        iFunc.print();
        
//        IFunctionalDif ifd = ("Hello") -> {
//            
//        };
    }
    
}
