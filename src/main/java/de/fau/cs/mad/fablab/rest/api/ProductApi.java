package de.fau.cs.mad.fablab.rest.api;

import de.fau.cs.mad.fablab.rest.core.Product;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("products")
public interface ProductApi {

    @GET
    @Path("/find/id")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    Product findById(@QueryParam("search") String id);


    @GET
    @Path("/find/name")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    List<Product> findByName(@QueryParam("search") String name,
                             @QueryParam("limit") int limit,
                             @QueryParam("offset") int offset);

    @GET
    @Path("/find/category")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    List<Product> findByCategory(@QueryParam("search") String category,
                                 @QueryParam("limit") int limit,
                                 @QueryParam("offset") int offset);

    @GET
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    List<Product> findAll(@QueryParam("limit") int limit,
                          @QueryParam("offset") int offset);

    @GET
    @Path("/find/all/withoutfilter")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    List<Product> findAllWithoutFilters(@QueryParam("limit") int limit,
                          @QueryParam("offset") int offset);


    @GET
    @Path("/names")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    List<String> findAllNames();

    @GET
    @Path("/autocompletions")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    List<String> getAutoCompletions();

}
