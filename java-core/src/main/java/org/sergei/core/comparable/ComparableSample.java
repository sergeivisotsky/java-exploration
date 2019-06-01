package org.sergei.core.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableSample {

    public static void main(String[] args) {
        
        List<HumanComparable> humanComparables = new ArrayList<>();
        humanComparables.add(new HumanComparable(1L, "John", "Smith", 21));
        humanComparables.add(new HumanComparable(2L, "Jessica", "Cane", 29));
        humanComparables.add(new HumanComparable(3L, "Jane", "Kromfold", 25));
        
        
        Collections.sort(humanComparables);
        
        humanComparables.forEach(System.out::println);
        
    }
    
}
