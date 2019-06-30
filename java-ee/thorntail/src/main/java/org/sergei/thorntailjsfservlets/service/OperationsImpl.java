package org.sergei.thorntailjsfservlets.service;

import javax.ejb.Stateful;

/**
 * @author Sergei Visotsky
 */
@Stateful
public class OperationsImpl implements Operations {

    @Override
    public String printHello() {
       return "Hello EJB!";
    }

}
