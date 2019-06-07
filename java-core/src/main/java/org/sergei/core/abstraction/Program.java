package org.sergei.core.abstraction;

/**
 * @author Sergei Visotsky
 */
public class Program extends Actions {

    public Program(String hello) {
        super(hello);
    }
    
    @Override
    public void metOne() {
        System.out.println("Met two");
        super.metOne();
    }

    @Override
    public void metImpl() {
        // TODO Auto-generated method stub
        
    }

    public static void main(String[] args) {
        Program program = new Program("Hello world!");
        program.metOne();
    }
    
}
