package org.sergei.core.arrays;

/**
 * @author Sergei Visotsky
 */
public class ArrayLooping {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }

        System.out.println(array2[4]);
    }

}
