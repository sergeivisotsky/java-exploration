package org.sergei.collections.comparison;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/**
 * HashMap works quicker than HashMap
 *
 * @author Sergei Visotsky
 */
public class LinkedHashMapHashMapComparison {

    public static void main(String[] args) {
        System.out.println("HashMap:");
        long beforeMap = System.nanoTime();
        Map<Integer, Integer> elemMap = new HashMap<>();
        for (int i = 0; i < 100_000; i++) {
            elemMap.put(i, new Random().nextInt());
        }
//        elemMap.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));
        long afterMap = System.nanoTime();
        System.out.println("Performance: " + (afterMap - beforeMap)); // This guy works quicker

        System.out.println();

        System.out.println("LinkedHashMap:");
        long beforeLHM = System.nanoTime();
        Map<Integer, Integer> elemLHM = new LinkedHashMap<>();
        for (int i = 0; i < 100_000; i++) {
            elemLHM.put(i, new Random().nextInt());
        }
//        elemLHM.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));
        long afterLHM = System.nanoTime();
        System.out.println("Performance: " + (afterLHM - beforeLHM));
    }

}
