package org.sergei.books.jpa;

import lombok.extern.slf4j.Slf4j;
import org.sergei.books.rest.BookDTO;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * @author Sergei Visotsky
 */
@Component
@Slf4j
public class BookRepository {

    private EntityManager em = JpaUtil.getEntityManager();

    public void createBook(BookDTO bookDTO) {
        em.getTransaction().begin();

        Book book = new Book();
        book.setId(bookDTO.getId());
        book.setTitle(bookDTO.getTitle());
        book.setIsbn(bookDTO.getIsbn());
        book.setAuthor(bookDTO.getAuthor());
        book.setYearOfCreation(bookDTO.getYearOfCreation());

        Query query = em.createNativeQuery("INSERT INTO book VALUES(?, ?, ?, ?, ?)");
        query.setParameter(1, book.getId());
        query.setParameter(2, book.getIsbn());
        query.setParameter(3, book.getTitle());
        query.setParameter(4, book.getAuthor());
        query.setParameter(5, book.getYearOfCreation());
        query.executeUpdate();

//        em.persist(book);

        em.getTransaction().commit();
    }


}
