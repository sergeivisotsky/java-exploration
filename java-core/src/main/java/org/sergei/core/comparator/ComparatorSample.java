package org.sergei.core.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Sergei Visotsky
 */
public class ComparatorSample {

    public static void main(String[] args) {
        
        List<EmployeeComparator> employeeComparators = new ArrayList<>();
        employeeComparators.add(new EmployeeComparator(1L, "John", "Smith", 21, 2.500));
        employeeComparators.add(new EmployeeComparator(3L, "Jessica", "Cane", 29, 3.000));
        employeeComparators.add(new EmployeeComparator(2L, "Jane", "Kromfold", 25, 2.900));
        
//        Comparator<EmployeeComparator> comparator = new Comparator<>() {
//            @Override
//            public int compare(EmployeeComparator o1, EmployeeComparator o2) {
//                if(o1.getAge() > o2.getAge()) {
//                    return 1;
//                } else {
//                    return 0;
//                }
//            }
//            
//        };
        
        Comparator<EmployeeComparator> comparator = (EmployeeComparator o1, EmployeeComparator o2) -> {
            if(o1.getAge() > o2.getAge()) {
                return 1;
            } else {
                return 0;
            }
        };
        
        Collections.sort(employeeComparators, comparator);
        
        employeeComparators.forEach(System.out::println);
        
    }
    
}
