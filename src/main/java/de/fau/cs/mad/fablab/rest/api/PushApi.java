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
    Boolean subscribeDoorOpensNextTime(PushToken pushToken);


    //RETROFIT CANT DELETE WITH BODY -> This works like a DELETE !
    @PUT
    @Path("/doorOpensNextTime")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Boolean unsubscribeDoorOpensNextTime(PushToken pushToken);


    @GET
    @Path("/doorOpensNextTime")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    Boolean doorOpensNextTimeIsSetForToken(@QueryParam("token") String token);


    @GET
    @Path("/test")
    Response test();
}





