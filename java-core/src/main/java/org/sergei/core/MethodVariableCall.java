package org.sergei.core;

/**
 * @author Sergei Visotsky
 */
class Foo {
    int number = 1;

    int getNumber() {
        return number;
    }
}

public class MethodVariableCall extends Foo {

    int number = 2;

    int getNumber() {
        return number;
    }

    public static void main(String[] args) {
        Foo foo = new MethodVariableCall();
        System.out.println(foo.number + " " + foo.getNumber() + " ");
        MethodVariableCall mvc = (MethodVariableCall) foo;
        System.out.println(mvc.number + " " + mvc.getNumber());
    }

}
