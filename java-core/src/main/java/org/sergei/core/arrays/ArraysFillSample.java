package org.sergei.core.arrays;

import java.util.Arrays;

/**
 * @author Sergei Visotsky
 */
public class ArraysFillSample {

    public static void main(String[] args) {

        String[] array = new String[5];
        Arrays.fill(array, "Hello");
        System.out.println(array[2]);

    }

}
