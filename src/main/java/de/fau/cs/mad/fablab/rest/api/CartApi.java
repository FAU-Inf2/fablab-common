package de.fau.cs.mad.fablab.rest.api;


import de.fau.cs.mad.fablab.rest.core.Cart;
import de.fau.cs.mad.fablab.rest.core.CartStatusEnum;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by EE on 12.05.15.
 */

@Path("carts")
public interface CartApi {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Cart create(Cart obj);


    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    CartStatusEnum getStatus(long id);


}
