package de.fau.cs.mad.fablab.rest.api;


import com.codahale.metrics.annotation.ExceptionMetered;
import com.codahale.metrics.annotation.Metered;
import com.codahale.metrics.annotation.Timed;
import de.fau.cs.mad.fablab.rest.core.CartServer;
import de.fau.cs.mad.fablab.rest.core.Product;
import de.fau.cs.mad.fablab.rest.core.RegistrationId;
import de.fau.cs.mad.fablab.rest.core.TestObject;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("mail")
public interface ContactApi {

    @POST
    @Path("/feedback")
    @Produces(MediaType.APPLICATION_JSON)
    Response sendFeedback(@QueryParam("msg") String aMessage);

    @POST
    @Path("/error")
    @Produces(MediaType.APPLICATION_JSON)
    Response sendErrorMessage(@QueryParam("id")long aToolId,@QueryParam("msg") String aMessage);

    @POST
    @Path("/test")
    @Metered
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    TestObject create(final TestObject obj);

    @GET
    @Path("/cartserver")
    @Produces(MediaType.APPLICATION_JSON)
    CartServer getCartServer();

    @GET
    @Path("/test2")
    @Produces(MediaType.APPLICATION_JSON)
    TestObject getTestObject();
}
