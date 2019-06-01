package org.sergei.core.instanceofexp;

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
