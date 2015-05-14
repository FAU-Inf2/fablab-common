package de.fau.cs.mad.fablab.rest.api;


import de.fau.cs.mad.fablab.rest.core.Product;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by EE on 12.05.15.
 */

@Path("products")
public interface ProductApi {

    @GET
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    Product findById(@PathParam("id") long id);


    @GET
    @Path("/name/{name}")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    List<Product> findByName(@PathParam("name") String name);

    @GET
    @Path("/cat/{category}")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    List<Product> findByCategory(@PathParam("category") String category);

    @GET
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    List<Product> findAll();

}
