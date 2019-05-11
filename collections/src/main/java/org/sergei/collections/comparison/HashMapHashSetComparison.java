package org.sergei.collections.comparison;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * The first difference that can be seen is that in HashMap we are able to use
 * key-value while in HashSet we can hold just only value without key. And what
 * is obvious in HshSet we cannot use Map interface due to is allows to use only
 * key-value byt HashSet allows to hold values only.
 * <p>
 * HashMap implemented by Map interface
 *
 * @author Sergei Visotsky
 */
public class HashMapHashSetComparison {
    public static void main(String[] args) {
        
        long beforeHM = System.nanoTime();
        // HashMap section
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Test 1");
        hashMap.put(2, "Test 2");
        hashMap.put(3, "Test 3");
        long afterHM = System.nanoTime();
        System.out.println("HashMap performance: " + (afterHM - beforeHM));

        long beforeHS = System.nanoTime();
        // HashSet section
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("one");
        hashSet.add("two");
        hashSet.add("three");
        long afterHS = System.nanoTime();
        System.out.println("HashSet performance: " + (afterHS = beforeHS));
        hashSet.forEach(System.out::println);
    }
}
