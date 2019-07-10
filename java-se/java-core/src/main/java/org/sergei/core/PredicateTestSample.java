package org.sergei.core;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author Sergei Visotsky
 */
public class PredicateTestSample {

    boolean verify(List<Integer> integers, Predicate<List> predicate) {
        return predicate.test(integers);
    }

    public static void main(String[] args) {
        PredicateTestSample predicate = new PredicateTestSample();
        var ints = List.of(1, 2, 3, 4);
        var resultOne = predicate.verify(ints, List::isEmpty);
        System.out.println(resultOne);
        var resultTwo = predicate.verify(ints, i -> i.add(4));
        System.out.println(resultTwo);
    }

}
