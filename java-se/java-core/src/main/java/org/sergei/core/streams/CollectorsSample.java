package org.sergei.core.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Sergei Visotsky
 */
public class CollectorsSample {

    public static void main(String[] args) {
        List<Integer> integers = IntStream
                                    .range(0, 1000)
                                    .boxed()
                                    .collect(Collectors.toList());
        integers.forEach(System.out::print);
    }

}
