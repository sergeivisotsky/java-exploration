package org.sergei.collections;

import java.util.Arrays;

/**
 * @author Sergei Visotsky
 */
public class CopyArraySample {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3};
        int[] array2 = Arrays.copyOf(array1, 4);
        System.out.println(array2[3]);

    }

}
