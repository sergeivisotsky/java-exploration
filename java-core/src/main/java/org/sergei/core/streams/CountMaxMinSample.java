package org.sergei.core.streams;

import java.util.Comparator;
import java.util.List;

/**
 * @author Sergei Visotsky
 */
public class CountMaxMinSample {

    public static void main(String[] args) {

        List<Integer> integers = List.of(1, 23, 39, 11, 97);
        long count = integers.stream().count();
        System.out.println("The number of elements in collection: " + count);

        int sum = integers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum: " + sum);

        int max = integers.stream().max(Comparator.comparing(i -> i)).get();
        System.out.println("Max value in the collection: " + max);

        int min = integers.stream().min(Comparator.comparing(i -> i)).get();
        System.out.println("Min value in the collection: " + min);
    }

}
