package de.fau.cs.mad.fablab.rest.api;


import de.fau.cs.mad.fablab.rest.core.ICal;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by EE on 12.05.15.
 */

@Path("ical")
public interface ICalApi {

    @GET
    @Path("/all")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    List<ICal> findAll();

    @GET
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
        // --> ical?offset=10&limit=100
    List<ICal> find(@QueryParam("offset") int offset,@QueryParam("limit") int limit);

    @GET
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    ICal findById(@PathParam("id")long id);

    @GET
    @Path("/timestamp")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    Long lastUpdate();
}
