package org.sergei.core.streams;

import java.util.List;
import java.util.Spliterator;

/**
 * @author Sergei Visotsky
 */
public class SplitSample {

    public static void main(String[] args) {

        List<String> strList = List.of("A", "B", "C", "D", "E", "F", "G", "H");
        Spliterator<String> part1 = strList.spliterator().trySplit();
        part1.tryAdvance(System.out::print);
        part1.forEachRemaining(System.out::print);
    }

}
