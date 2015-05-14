package de.fau.cs.mad.fablab.rest.api;


import de.fau.cs.mad.fablab.rest.core.Cart;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by EE on 12.05.15.
 */

@Path("carts")
public interface CartApi {

    //Send cart to the server
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Cart create(Cart obj);


    //Update cart at server (status/ items...)
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Cart update(Cart obj);


    //delete cart (after paying?)
    @DELETE
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    void delete(long id);

}
