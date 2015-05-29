package de.fau.cs.mad.fablab.rest.api;


import io.dropwizard.jersey.params.LongParam;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/push")
public interface PushApi {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Response addRegistrationId(@PathParam("regid") LongParam regId);

}





