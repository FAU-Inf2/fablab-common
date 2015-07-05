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
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    // --> news?offset=10&limit=100
    List<News> find(@QueryParam("offset") int offset,@QueryParam("limit") int limit);

    @GET
    @Path("/all")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    List<News> findAll();

    @GET
    @Path("/timestamp")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    long lastUpdate();
}
