package de.fau.cs.mad.fablab.rest.api;


import de.fau.cs.mad.fablab.rest.core.ICal;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by EE on 12.05.15.
 */


public interface ICalApi {

    @GET
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    List<ICal> findAll();

    @GET
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    ICal findById(@PathParam("id")long id);


}
