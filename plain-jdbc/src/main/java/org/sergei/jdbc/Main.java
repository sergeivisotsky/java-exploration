package org.sergei.jdbc;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        ICustomerDAO customerDAO = new CustomerDAO();
        
        List<Customer> customers = customerDAO.findAll();
        log.info(customers.toString());
    }
    
}
