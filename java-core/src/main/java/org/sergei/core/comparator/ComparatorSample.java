package org.sergei.core.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSample {

    public static void main(String[] args) {
        
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1L, "John", "Smith", 21, 2.500));
        employees.add(new Employee(3L, "Jessica", "Cane", 29, 3.000));
        employees.add(new Employee(2L, "Jane", "Kromfold", 25, 2.900));
        
//        Comparator<Employee> comparator = new Comparator<>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                if(o1.getAge() > o2.getAge()) {
//                    return 1;
//                } else {
//                    return 0;
//                }
//            }
//            
//        };
        
        Comparator<Employee> comparator = (Employee o1, Employee o2) -> {
            if(o1.getAge() > o2.getAge()) {
                return 1;
            } else {
                return 0;
            }
        };
        
        Collections.sort(employees, comparator);
        
        employees.forEach(System.out::println);
        
    }
    
}
