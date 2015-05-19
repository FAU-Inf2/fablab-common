package de.fau.cs.mad.fablab.rest.api;

import de.fau.cs.mad.fablab.rest.core.Product;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("products")
public interface ProductApi {

    @GET
    @Path("/id/{id}")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    Product findById(@QueryParam("id") long id);


    @GET
    @Path("/name/{name}")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    List<Product> findByName(@QueryParam("name") String name,
                             @QueryParam("limit") int limit,
                             @QueryParam("offset") int offset);

    @GET
    @Path("/category/{category}")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    List<Product> findByCategory(@QueryParam("category") String category);

    @GET
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    List<Product> findAll(@QueryParam("limit") int limit,
                          @QueryParam("offset") int offset);

}
