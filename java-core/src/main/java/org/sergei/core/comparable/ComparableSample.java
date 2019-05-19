package org.sergei.core.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableSample {

    public static void main(String[] args) {
        
        List<Human> humans = new ArrayList<>();
        humans.add(new Human(1L, "John", "Smith", 21));
        humans.add(new Human(2L, "Jessica", "Cane", 29));
        humans.add(new Human(3L, "Jane", "Kromfold", 25));
        
        
        Collections.sort(humans);
        
        humans.forEach(System.out::println);
        
    }
    
}
