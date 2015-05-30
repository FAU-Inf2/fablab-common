package de.fau.cs.mad.fablab.rest.api;


import de.fau.cs.mad.fablab.rest.entities.WelcomeUser;
import io.dropwizard.jersey.params.LongParam;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/push")
public interface PushApi {

    @GET
    @Path("/{regid}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    WelcomeUser addRegistrationId(@PathParam("regid") String regId);

}





