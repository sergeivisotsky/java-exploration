package org.sergei.core.streams;

import java.util.Arrays;

/**
 * @author Sergei Visotsky
 */
public class FilterStreamOfArray {

    public static void main(String[] args) {
        String[] fruits = {"Apple", "Orange", "apricots", "Grape", "Bananoe", "Quiwi"};
        Arrays
            .stream(fruits)
            .filter(x -> x.toLowerCase().startsWith("a"))
            .sorted()
            .forEach(System.out::println);
    }
    
}
