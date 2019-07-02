package org.sergei.bookordering.jpa.repository;

import lombok.extern.slf4j.Slf4j;
import org.sergei.bookordering.jpa.model.Book;

import javax.annotation.ManagedBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Sergei Visotsky
 */
@Stateless
@Slf4j
public class BookRepository {

    @PersistenceContext(unitName = "book-ordering")
    private EntityManager em;

    public void createBook(Book book) {
        em.persist(book);
        em.close();
    }



}
