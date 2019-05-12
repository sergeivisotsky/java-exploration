package org.sergei.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomerDAO implements ICustomerDAO {

    private static final Logger log = LoggerFactory.getLogger(CustomerDAO.class);
    
    private final Configurer config;
    
    public CustomerDAO() {
        config = new Configurer();
    }

    @Override
    public List<Customer> findAll() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Customer> customers = new ArrayList<>();
        
        try {
            conn = config.getConnection();
            pstmt = conn.prepareStatement("select * from customer");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                customers.add(
                        Customer
                            .builder()
                                .withId(rs.getLong("ID"))
                                .withFirstName(rs.getString("FIRST_NAME"))
                                .withLastName(rs.getString("LAST_NAME"))
                                .withAge(rs.getInt("AGE"))
                                .withProfit(rs.getDouble("PROFIT"))
                            .build()
                        );
                return customers;
            }
        } catch (SQLException e) {
            log.error("Error executing SQL: ", e);
        } finally {
            try {
                if (conn != null) {
                    rs.close();
                    pstmt.close();
                    conn.close();
                } else {
                    throw new SQLException("Connection has lost in " + this.getClass());
                }
            } catch (SQLException e) {
                log.error("Some problems in: {}", this.getClass(), e);
            }
        }
        return customers;
    }

    @Override
    public Customer findOne(Long customerId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Customer insert(Customer customer) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Customer delete(Long customerId) {
        // TODO Auto-generated method stub
        return null;
    }

}
