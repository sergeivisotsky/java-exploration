package org.sergei.core.streams;

import java.util.stream.Stream;

/**
 * @author Sergei Visotsky
 */
public class ErroredStreamSample {

    public static void main(String[] args) {

        Stream<Integer> numStream = Stream.of(10, 20, 30);
        numStream.map(n -> n + 10).peek(s -> System.out.print(s));
        numStream.forEach(s -> System.out.println(s));

    }

}
