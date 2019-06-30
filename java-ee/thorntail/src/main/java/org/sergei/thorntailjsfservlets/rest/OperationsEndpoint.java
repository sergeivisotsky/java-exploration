package org.sergei.thorntailjsfservlets.rest;

import org.sergei.thorntailjsfservlets.service.OperationsImpl;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * @author Sergei Visotsky
 */
@Path("/ops")
public class OperationsEndpoint {

    @Inject
    private OperationsImpl operations;

    @GET
    @Produces({"text/plain"})
    public String printHello() {
        return operations.printHello();
    }

}
