package org.sergei.core.generics;

import java.util.List;

/**
 * @author Sergei Visotsky
 */
public class GenericTypeMethodSample {

    private static <E> void printList(List<E> ints) {
        for (E elem : ints) {
            System.out.printf("%s\t", elem);
        }
    }

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        printList(integers);
    }

}
