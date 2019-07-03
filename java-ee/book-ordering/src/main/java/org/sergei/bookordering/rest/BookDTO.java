package org.sergei.bookordering.rest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Sergei Visotsky
 */
@Getter
@Setter
@AllArgsConstructor
public class BookDTO {

    private Long id;
    private String isbn;
    private String title;
    private String author;
    private Integer yearOfCreation;

}
