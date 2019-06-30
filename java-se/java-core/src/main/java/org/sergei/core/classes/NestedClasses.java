package org.sergei.core.classes;

/**
 * @author Sergei Visotsky
 */
public class NestedClasses {

    class InnerClass {
        public void outputData() {
            System.out.println("Hello world from inner class");
        }
    }
    
    public void display() {
        InnerClass innerClass = new InnerClass();
        innerClass.outputData();
    }
    
    public static void main(String[] args) {
        NestedClasses nc = new NestedClasses();
        nc.display();
    }
    
}
