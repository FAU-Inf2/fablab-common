package de.fau.cs.mad.fablab.rest.api;


import de.fau.cs.mad.fablab.rest.core.CartServer;
import de.fau.cs.mad.fablab.rest.core.CartStatus;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * API to upload/create shopping carts and to get status information
 */

@Path("carts")
public interface CartApi {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    void create(CartServer obj);

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/status/{id}")
    CartStatus getStatus(@PathParam("id") String id);


}
