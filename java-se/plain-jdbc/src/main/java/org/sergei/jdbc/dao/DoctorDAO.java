package org.sergei.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.sergei.jdbc.Configurer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Sergei Visotsky
 */
public class DoctorDAO implements IDoctorDAO {

    private static final Logger log = LoggerFactory.getLogger(DoctorDAO.class);
    
    private final Configurer config;
    
    public DoctorDAO() {
        config = new Configurer();
    }

    @Override
    public List<Doctor> findAll() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Doctor> doctors = new ArrayList<>();
        
        try {
            conn = config.getConnection();
            pstmt = conn.prepareStatement(
                    "SELECT \n" +
                    "    D.ID, \n" +
                    "    D.FIRST_NAME, \n" +
                    "    D.LAST_NAME, \n" +
                    "    D.POSITION, \n" +
                    "    D.EXPERIENCE_YEARS,\n" +
                    "    SP.SPEC_NAME,\n" +
                    "    SP.EXP_REQUIRED,\n" +
                    "    C.ROOM_NUMBER,\n" +
                    "    C.ROOM_TITLE,\n" +
                    "    C.NUMBER_OF_PERS,\n" +
                    "    DEP.TITLE,\n" +
                    "    DEP.NUMBER_OF_PATIENTS\n" +
                    "FROM DOCTOR D\n" +
                    "    LEFT OUTER JOIN SPECIALITY SP ON D.SPCLTY_ID = SP.ID\n" +
                    "    LEFT OUTER JOIN CABINET C ON D.CAB_ID = C.ID\n" +
                    "    LEFT OUTER JOIN DEPARTMENT DEP ON D.DEP_ID = DEP.ID");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                doctors.add(
                        Doctor
                            .newBuilder()
                                .withId(rs.getLong("ID"))
                                .withFirstName(rs.getString("FIRST_NAME"))
                                .withLastName(rs.getString("LAST_NAME"))
                                .withExperience(rs.getInt("EXPERIENCE_YEARS"))
                                .withRoom(
                                        Room.newBuilder()
                                                .withRoomTitle(rs.getString("ROOM_TITLE"))
                                                .withRoomNumber(rs.getInt("ROOM_NUMBER"))
                                            .build())
                                .withSpeciality(
                                        Speciality.newBuilder()
                                                    .withRequiredExperience(rs.getInt("EXP_REQUIRED"))
                                                    .withTitle(rs.getString("ROOM_TITLE"))
                                                .build())
                                .withDepartment(
                                        Department.newBuilder()
                                                    .withTitle(rs.getString("TITLE"))
                                                    .withNumberOfPatients(rs.getInt("NUMBER_OF_PATIENTS"))
                                                .build())
                            .build()
                        );
                return doctors;
            }
        } catch (SQLException e) {
            log.error("Error executing SQL: ", e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                    if (pstmt != null) {
                        pstmt.close();
                        if (conn != null) {
                            conn.close();
                        } else {
                            throw new SQLException("Connection has lost in " + this.getClass());
                        }
                    } else {
                        throw new SQLException("Prepared statement is nullable " + this.getClass());
                    }
                } else {
                    throw new SQLException("Result set is nullable " + this.getClass());
                }
            } catch (SQLException e) {
                log.error("Some problems in: {}", this.getClass(), e);
            }
        }
        return doctors;
    }

    @Override
    public Doctor findOne(Long customerId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Doctor insert(Doctor doctor) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Doctor delete(Long customerId) {
        // TODO Auto-generated method stub
        return null;
    }

}
