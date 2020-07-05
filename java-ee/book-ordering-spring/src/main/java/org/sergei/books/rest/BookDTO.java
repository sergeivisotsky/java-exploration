package org.sergei.books.rest;

/**
 * @author Sergei Visotsky
 */
public class BookDTO {

    private Long id;
    private String isbn;
    private String title;
    private String author;
    private Integer yearOfCreation;

    public BookDTO() {
    }

    public BookDTO(Long id, String isbn, String title, String author, Integer yearOfCreation) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearOfCreation = yearOfCreation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(Integer yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }
}
