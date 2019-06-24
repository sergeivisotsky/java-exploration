package org.sergei.core.arrays;

import java.util.Arrays;

/**
 * @author Sergei Visotsky
 */
public class Mismatch {

    public static void main(String[] args) {

        String[] a = {"a", "b"};
        String[] b = {"b", "a"};
        String[] s = {"a"};

        int misA = Arrays.mismatch(a, b);
        int misB = Arrays.mismatch(b, s);
        int misC = Arrays.mismatch(a, s);

        System.out.println("misA: " + misA);
        System.out.println("misB: " + misB);
        System.out.println("misC: " + misC);

    }

}
