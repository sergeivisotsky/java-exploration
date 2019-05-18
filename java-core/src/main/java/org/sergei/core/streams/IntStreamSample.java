package org.sergei.core.streams;

import java.util.stream.IntStream;

public class IntStreamSample {

    public static void main(String[] args) {
        int result = IntStream
            .range(1, 20)
            .sum();
        System.out.println(result);
    }
    
}
