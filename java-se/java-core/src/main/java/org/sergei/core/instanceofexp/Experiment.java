package org.sergei.core.instanceofexp;

/**
 * @author Sergei Visotsky
 */
public class Experiment {
    
    public static void main(String[] args) {
        Employee employee = new Employee();
        if (employee instanceof HumanInstanceOf) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    
}
