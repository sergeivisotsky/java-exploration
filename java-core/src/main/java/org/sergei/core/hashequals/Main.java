package org.sergei.core.hashequals;

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
