package org.sergei.collections.comparison;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Sergei Visotsky
 */
public class HashMapTreeMap {

    public static void main(String[] args) {
        long beforeHM = System.nanoTime();
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(3, "D");
        map.put(2, "B");
        map.put(4, "C");
        for(Iterator<?> it = map.entrySet().iterator(); it.hasNext();) {
            Map.Entry<Integer, String> pairs = (Map.Entry) it.next();
            System.out.println(pairs.getKey() + "=" + pairs.getValue());
        }
        long afterHM = System.nanoTime();
        System.out.println("HashMap performance: " + (afterHM - beforeHM));
        
        long beforeTM = System.nanoTime();
        Map<Integer, String> mapTwo = new TreeMap<>();
        mapTwo.put(1, "A");
        mapTwo.put(3, "D");
        mapTwo.put(2, "B");
        mapTwo.put(4, "C");
        for(Iterator<?> it = mapTwo.entrySet().iterator(); it.hasNext();) {
            Map.Entry<Integer, String> pairs = (Map.Entry) it.next();
            System.out.println(pairs.getKey() + "=" + pairs.getValue());
        }
        long afterTM = System.nanoTime();
        System.out.println("TreeMap performance: " + (afterTM - beforeTM));
    }
    
}
