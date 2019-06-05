package org.sergei.core.streams;

import java.util.List;
import java.util.stream.Collectors;

public class CollectionStreamSample {

    public static void main(String[] args) {
        System.out.println("===== Before =====");
        List<Integer> elements = List.of(1, 2, 3, 4, 5);
        elements.forEach(System.out::println);

        System.out.println("===== After =====");
        List<String> intStream = elements.stream().map(Object::toString).collect(Collectors.toList());
        intStream.forEach(System.out::println);
    }

}
