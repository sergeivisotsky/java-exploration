package org.sergei.jdbc;

import java.util.List;

import org.sergei.jdbc.dao.Doctor;
import org.sergei.jdbc.dao.DoctorDAO;
import org.sergei.jdbc.dao.IDoctorDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Sergei Visotsky
 */
public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        IDoctorDAO customerDAO = new DoctorDAO();
        
        List<Doctor> doctors = customerDAO.findAll();
        log.info(doctors.toString());
    }
    
}
