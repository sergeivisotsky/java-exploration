package org.sergei.jdbc.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * @author Sergei Visotsky
 */
@Path("/test")
public class DoctorController {

    @GET
    @Path("/1")
    @Produces("application/text-plain")
    public String hello() {
        return "Welcome";
    }

}
