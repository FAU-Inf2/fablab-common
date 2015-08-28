package de.fau.cs.mad.fablab.rest.api;


import com.codahale.metrics.annotation.Metered;
import de.fau.cs.mad.fablab.rest.core.CartServer;
import de.fau.cs.mad.fablab.rest.core.TestObject;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("mail")
public interface ContactApi {

    @POST
    @Path("/feedback")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Response sendFeedback(@QueryParam("msg") String aMessage);

    @POST
    @Path("/error")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Response sendErrorMessage(@QueryParam("id")long aToolId,@QueryParam("msg") String aMessage);


}
