package org.sergei.core.streams;

import java.util.stream.Stream;

/**
 * @author Sergei Visotsky
 */
public class StreamOfSample {

    public static void main(String[] args) {
        Stream
            .of("Test1", "Test2", "Test3")
            .sorted()
            .forEach(System.out::println);
    }
    
}
