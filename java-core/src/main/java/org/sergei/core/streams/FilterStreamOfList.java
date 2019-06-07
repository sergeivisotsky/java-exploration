package org.sergei.core.streams;

import java.util.Arrays;
import java.util.List;

/**
 * @author Sergei Visotsky
 */
public class FilterStreamOfList {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "apricot", "Grape", "Bananoe", "Quiwi");
        fruits
            .stream()
            .map(String::toLowerCase)
            .filter(x -> x.startsWith("a"))
            .forEach(System.out::println);
    }
    
}
