package org.sergei.core.lambda;

/**
 * @author Sergei Visotsky
 */
@FunctionalInterface
interface Square {
    
    int calculate(int x);
    
}

public class FunctionalnterfacesSample {

    public static void main(String[] args) {
        int a = 5;
        Square square = (int x) -> x * x;
        int ans = square.calculate(a);
        System.out.println(ans);
    }
    
}
