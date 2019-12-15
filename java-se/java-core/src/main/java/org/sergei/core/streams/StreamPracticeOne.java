package org.sergei.core.streams;

import java.util.Arrays;
import java.util.List;

/**
 * @author Sergei Visotsky
 */
public class StreamPracticeOne {

    public static void main(String[] args) {

        List<String> apples = Arrays.asList("Royal gala", "Red prince", "Champion");

        apples.stream().map(apple -> apples)
                .filter(apple -> apple.contains("a"))
                .forEach(System.out::println);

    }

}
