package de.fau.cs.mad.fablab.rest.api;



import de.fau.cs.mad.fablab.rest.core.PushToken;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("push")
public interface PushApi {


    @POST
    @Path("/doorOpensNextTime")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Response subscribeDoorOpensNextTime(PushToken pushToken);

    @PUT
    @Path("/doorOpensNextTime")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Response unsubscribeDoorOpensNextTime(PushToken pushToken);


    @GET
    @Path("/test")
    Response test();
}





