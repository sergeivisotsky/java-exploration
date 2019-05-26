package org.sergei.core.streams;

import java.util.List;
import java.util.stream.Stream;

public class VerboseStream {

    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "orange", "persimmon", "plume");
        Stream<String> firstStream = fruits.stream();
        Stream<String> secondStream = firstStream.filter(s -> s.startsWith("a"));
        Stream<String> thirdStream = secondStream.map(String::toUpperCase);
        thirdStream.forEach(System.out::print);
    }

}
