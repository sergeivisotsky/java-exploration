package org.sergei.books.jpa;

import lombok.extern.slf4j.Slf4j;
import org.sergei.books.rest.BookDTO;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergei Visotsky
 */
@Component
@Slf4j
public class BookRepository {

    private EntityManager em = JpaUtil.getEntityManager();

    public List<BookDTO> findAll() {
//        em.getTransaction().begin();

        final Query findAllQuery =
                em.createNativeQuery("SELECT * FROM book", Book.class);

        List<Book> allBooks = findAllQuery.getResultList();

        List<BookDTO> bookDTOList = new ArrayList<>();

        allBooks.forEach(book ->
                {
                    BookDTO bookDTO = new BookDTO();

                    bookDTO.setId(book.getId());
                    bookDTO.setAuthor(book.getAuthor());
                    bookDTO.setTitle(book.getTitle());
                    bookDTO.setIsbn(bookDTO.getIsbn());
                    bookDTO.setYearOfCreation(book.getYearOfCreation());

                    bookDTOList.add(bookDTO);
                }
        );

        return bookDTOList;
    }

    public BookDTO createBook(BookDTO bookDTO) {
//        em.getTransaction().begin();

        Book book = new Book();
        book.setId(bookDTO.getId());
        book.setTitle(bookDTO.getTitle());
        book.setIsbn(bookDTO.getIsbn());
        book.setAuthor(bookDTO.getAuthor());
        book.setYearOfCreation(bookDTO.getYearOfCreation());

        final Query createQuery =
                em.createNativeQuery("INSERT INTO book VALUES(?, ?, ?, ?, ?)");
        createQuery.setParameter(1, book.getId());
        createQuery.setParameter(2, book.getIsbn());
        createQuery.setParameter(3, book.getTitle());
        createQuery.setParameter(4, book.getAuthor());
        createQuery.setParameter(5, book.getYearOfCreation());

        createQuery.executeUpdate();

//        em.persist(book);

//        em.getTransaction().commit();
        return bookDTO;
    }


}
