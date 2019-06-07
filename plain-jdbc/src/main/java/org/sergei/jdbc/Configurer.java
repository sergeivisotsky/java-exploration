package org.sergei.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.sergei.jdbc.dao.CustomerDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Configurer {

    private static final Logger log = LoggerFactory.getLogger(CustomerDAO.class);
    
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://localhost:5432/sandbox";
    private static final String USERNAME = "sergei";
    private static final String PASSWORD = "admin";
    
    public Connection getConnection() {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            log.info("Connection has lost in the following class: {}", this.getClass());
        }
        return null;
    }
}
