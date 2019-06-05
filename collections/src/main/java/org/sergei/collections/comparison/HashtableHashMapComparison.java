package org.sergei.collections.comparison;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashtableHashMapComparison {

    public static void main(String[] args) {

        long beforeHM = System.nanoTime();
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        long afterHM = System.nanoTime();
        System.out.println("HashMap performance: " + (afterHM - beforeHM));

        long beforeHT = System.nanoTime();
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "One");
        hashtable.put(2, "Two");
        hashtable.put(3, "Three");
        long afterHT = System.nanoTime();
        System.out.println("Hashtable performance: " + (afterHT - beforeHT));

    }

}
