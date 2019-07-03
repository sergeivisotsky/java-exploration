package org.sergei.books.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Sergei Visotsky
 */
public class JpaUtil {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("books");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

}
