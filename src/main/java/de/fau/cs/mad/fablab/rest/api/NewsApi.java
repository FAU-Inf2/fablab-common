package de.fau.cs.mad.fablab.rest.api;


import de.fau.cs.mad.fablab.rest.core.News;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by EE on 12.05.15.
 */

@Path("news")
public interface NewsApi {


    @GET
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    News findById(@PathParam("id")long id);

    @GET
    @Path("/{offset}/{limit}") //TODO --> change to news?offset=&limit=  --> HOW?
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    List<News> find(@PathParam("offset") int offset, @PathParam("limit")int limit);

    @GET
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    List<News> findAll();
}
