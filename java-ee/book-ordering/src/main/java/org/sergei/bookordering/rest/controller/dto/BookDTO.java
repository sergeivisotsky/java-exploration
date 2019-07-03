package org.sergei.bookordering.rest.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

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
