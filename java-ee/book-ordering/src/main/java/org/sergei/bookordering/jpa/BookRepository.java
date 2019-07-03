package org.sergei.bookordering.jpa;

import lombok.extern.slf4j.Slf4j;
import org.sergei.bookordering.jpa.JpaUtil;
import org.sergei.bookordering.jpa.Book;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Sergei Visotsky
 */
@Stateless
@Slf4j
public class BookRepository {

    @PersistenceContext(unitName = "books")
    private EntityManager em = JpaUtil.getEntityManager();

    public void createBook(Book book) {
        em.persist(book);
        em.close();
    }



}
