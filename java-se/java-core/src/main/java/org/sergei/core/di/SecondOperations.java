package org.sergei.core.di;

/**
 * @author Sergei Visotsky
 */
public class SecondOperations {

    private final FirstOperations firstOperations;

    public SecondOperations(FirstOperations firstOperations) {
        this.firstOperations = firstOperations;
    }

    public static void main(String[] args) {
        FirstOperations firstOperations = new FirstOperations();
        SecondOperations secondOperations = new SecondOperations(firstOperations);
        secondOperations.firstOperations.start();
    }

}
