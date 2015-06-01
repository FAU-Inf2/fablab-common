package de.fau.cs.mad.fablab.rest.api;



import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/push")
public interface PushApi {

    @POST
    @Path("/{regid}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Response addRegistrationId(@PathParam("regid") String regId);

}





