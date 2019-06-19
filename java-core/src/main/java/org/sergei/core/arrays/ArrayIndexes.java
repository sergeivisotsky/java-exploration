package org.sergei.core.arrays;

/**
 * @author Sergei Visotsky
 */
public class ArrayIndexes {

    public static void main(String[] args) {

        Object[][] strings = new String[2][2];
        strings[1][1] = "test";
        strings[0] = new String[1];
        strings[1] = new String[3];
        System.out.println(strings[1][1]);

    }

}
