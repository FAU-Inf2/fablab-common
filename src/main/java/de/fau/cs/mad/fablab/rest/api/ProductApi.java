package de.fau.cs.mad.fablab.rest.api;

import de.fau.cs.mad.fablab.rest.entities.Product;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Interface for accessing products
 */
@Path("/products")
@Produces(MediaType.APPLICATION_JSON)
public interface ProductApi {

    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    List<Product> getProducts();

    @GET
    @Path("/item/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    Product getProduct(@PathParam("id") int id);
}
