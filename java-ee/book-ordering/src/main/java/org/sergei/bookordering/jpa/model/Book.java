package org.sergei.bookordering.jpa.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Sergei Visotsky
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "book")
@Table(name = "book")
public class Book {

    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "seq", initialValue = 1, allocationSize = 100)
    private Long id;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "year_of_creation")
    private Integer yearOfCreation;

}
