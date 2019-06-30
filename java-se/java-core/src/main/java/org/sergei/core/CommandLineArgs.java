package org.sergei.core;

import java.util.Arrays;

/**
 * @author Sergei Visotsky
 */
public class CommandLineArgs {

    public static void main(String[] args) {
        String concat = Arrays.toString(args);
        System.out.println(concat);
    }

}
