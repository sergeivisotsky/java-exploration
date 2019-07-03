package org.sergei.bookordering.rest.controller;

import org.sergei.bookordering.jpa.model.Book;
import org.sergei.bookordering.jpa.repository.BookRepository;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * @author Sergei Visotsky
 */
@Path("/books")
public class BookController {

    @Inject
    private BookRepository bookRepository;

    @GET
    @Produces({"application/json"})
    public Response findAll() {
        return Response.ok("Implement").build();
    }

    @POST
    @Produces({"application/json"})
    @Consumes({"application/json"})
    public Response save(Book book) {
        bookRepository.createBook(book);
        return Response.ok().build();
    }

}
