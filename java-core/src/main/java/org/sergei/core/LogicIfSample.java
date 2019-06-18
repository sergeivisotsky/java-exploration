package org.sergei.core;

/**
 * @author Sergei Visotsky
 */
public class LogicIfSample {

    public static void main(String[] args) {

        int x = 1, y = 2;
        x += x < y ? y : x;
        y = x < y ? y - x : y + x;
        y = y + x;
        System.out.println(x + " " + y);

    }

}