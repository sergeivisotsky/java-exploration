package org.sergei.core.lambda;

/**
 * @author Sergei Visotsky
 */
@FunctionalInterface
interface IArithmetic {
    int mul(int a, int b);
}

public class LambdaFirstSample {

    public static void main(String[] args) {

        IArithmetic sum = (a, b) -> a * b;
        System.out.println(sum.mul(1, 3));
    }

}
