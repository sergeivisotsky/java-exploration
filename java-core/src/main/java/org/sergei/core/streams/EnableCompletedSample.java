package org.sergei.core.streams;

import java.util.Arrays;

/**
 * @author Sergei Visotsky
 */
public class EnableCompletedSample {

    public static void main(String[] args) {

        var lst = Arrays.asList(1, 2, 3, 4);
//        var lst = List.of(1, 2, 3, 4); // Incorrect by itself
        lst.replaceAll(x -> x + 100);
        System.out.println("-Completed-");

    }

}
