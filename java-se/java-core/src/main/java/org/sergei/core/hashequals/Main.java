package org.sergei.core.hashequals;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sergei Visotsky
 */
public class Main {

    public static void main(String[] args) {
        Employee employeeOne = Employee
                                .builder()
                                    .withExperience(20)
                                    .withSalary(12000.0)
                                .build();
        Employee employeeTwo = Employee
                                .builder()
                                    .withExperience(15)
                                    .withSalary(1200.0)
                                .build();
        
        Map<Integer, Employee> employees = new HashMap<>();
        employees.put(1, employeeOne);
        employees.put(2, employeeTwo);
        
        if (employees.get(1).hashCode() == employees.get(2).hashCode()) {
            System.out.println("Equals");
        }
        
        System.out.println("EmployeeComparator one hashCode is: " + employeeOne.hashCode());
        
        if (employeeOne.equals(employeeTwo)) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }
            
        if (employeeOne.hashCode() == employeeTwo.hashCode()) {
            System.out.println("Hash codes are equal");
        } else {
            System.out.println("Hash codes are not equal");
        }

    }
    
}
