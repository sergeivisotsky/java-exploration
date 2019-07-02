package org.sergei.bookordering.jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Sergei Visotsky
 */
public class JpaUtil {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("");

}
