package org.sergei.bookordering.rest.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * @author Sergei Visotsky
 */
@Path("/books")
public class BookController {

    @GET
    @Produces({"application/json"})
    public Response findAll() {
        return Response.ok("Implement").build();
    }

}
