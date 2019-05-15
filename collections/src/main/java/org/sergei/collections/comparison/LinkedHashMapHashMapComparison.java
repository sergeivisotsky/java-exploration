package org.sergei.collections.comparison;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LinkedHashMap works quicker than HashMap
 */
public class LinkedHashMapHashMapComparison {

    public static void main(String[] args) {
        System.out.println("HashMap:");
        long beforeMap = System.nanoTime();
        Map<Integer, String> fruitsMap = new HashMap<>();
        fruitsMap.put(1, "apple");
        fruitsMap.put(2, "orange");
        fruitsMap.put(3, "mellon");
        fruitsMap.put(4, "grape");
        fruitsMap.put(5, "quiwi");
        fruitsMap.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));
        long afterMap = System.nanoTime();
        System.out.println("Performance: " + (afterMap - beforeMap));
        
        System.out.println();

        System.out.println("LinkedHashMap:");
        long beforeLHM = System.nanoTime();
        Map<Integer, String> fruitsLHM = new LinkedHashMap<>();
        fruitsLHM.put(1, "apple");
        fruitsLHM.put(2, "orange");
        fruitsLHM.put(3, "mellon");
        fruitsLHM.put(4, "grape");
        fruitsLHM.put(5, "quiwi");
        fruitsLHM.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));
        long afterLHM = System.nanoTime();
        System.out.println("Performance: " + (afterLHM - beforeLHM)); // This guy works quicker
    }
    
}
