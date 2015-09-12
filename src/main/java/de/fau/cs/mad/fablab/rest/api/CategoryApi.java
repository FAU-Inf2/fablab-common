package de.fau.cs.mad.fablab.rest.api;

import de.fau.cs.mad.fablab.rest.core.Category;
import de.fau.cs.mad.fablab.rest.core.Product;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("categories")
public interface CategoryApi {

    @GET
    @Path("/find/all")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    List<Category> findAll();

    @GET
    @Path("/autocompletions")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    List<String> getAutoCompletions();


}
