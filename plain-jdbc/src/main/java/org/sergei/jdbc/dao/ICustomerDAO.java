package org.sergei.jdbc.dao;

import java.util.List;

public interface ICustomerDAO {

    List<Customer> findAll();

    Customer findOne(Long customerId);

    Customer insert(Customer customer);

    Customer delete(Long customerId);

}
