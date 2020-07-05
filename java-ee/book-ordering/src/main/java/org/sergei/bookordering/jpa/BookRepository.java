package org.sergei.bookordering.jpa;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Sergei Visotsky
 */
@Stateless
public class BookRepository {

    @PersistenceContext(unitName = "books")
    private EntityManager em = JpaUtil.getEntityManager();

    public void createBook(Book book) {
        em.persist(book);
        em.close();
    }


}
