package de.fau.cs.mad.fablab.rest.api;



import de.fau.cs.mad.fablab.rest.core.RegistrationId;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("push")
public interface PushApi {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Response addRegistrationId(RegistrationId aRegistrationId);

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Response removeRegistrationId(RegistrationId aRegistrationId);
}





