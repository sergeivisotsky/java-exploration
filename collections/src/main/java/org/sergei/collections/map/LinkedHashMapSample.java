package org.sergei.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Sergei Visotsky
 */
public class LinkedHashMapSample {

    public static void main(String[] args) {
        long beforeLHM = System.nanoTime();
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Value one");
        map.put(2, "Second value");
        map.put(3, "Third value");
        map.put(4, "Fourth value");
        map.put(5, "Fifth value");
        long afterLHM = System.nanoTime();
        System.out.println("LinkedHashMap performance: " + (afterLHM - beforeLHM));
        map.get(4);
        
        Set<Integer> keys = map.keySet();
        System.out.println(keys.toString());
        
    }
    
}
