package org.sergei.core.comparator;

public class Comparator {

    public static void main(String[] args) {
        Employee empOne = Employee
                            .builder()
                                .withId(1L)
                                .withFirstName("John")
                                .withLastName("Smith")
                                .withAge(21)
                                .withSalary(2500.0)
                            .build();

        Employee empTwo = Employee
                .builder()
                    .withId(2L)
                    .withFirstName("Jane")
                    .withLastName("Kennie")
                    .withAge(25)
                    .withSalary(1900.0)
                .build();

        int compare = empOne.compare(empOne, empTwo);
        System.out.println(compare);
    }
    
}
