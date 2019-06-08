package org.sergei.jdbc.dao;

import java.util.List;

/**
 * @author Sergei Visotsky
 */
public interface IDoctorDAO {

    List<Doctor> findAll();

    Doctor findOne(Long customerId);

    Doctor insert(Doctor doctor);

    Doctor delete(Long customerId);

}
