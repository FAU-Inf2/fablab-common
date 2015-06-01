package de.fau.cs.mad.fablab.rest.api;


import de.fau.cs.mad.fablab.rest.core.Cart;
import de.fau.cs.mad.fablab.rest.core.CartStatusEnum;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * API to upload/create shopping carts and to get status information
 */

@Path("carts")
public interface CartApi {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    void create(Cart obj);

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    CartStatusEnum getStatus(@PathParam("id") String id);


}
