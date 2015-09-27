package de.fau.cs.mad.fablab.rest.api;

import de.fau.cs.mad.fablab.rest.core.FabTool;
import de.fau.cs.mad.fablab.rest.core.ToolUsage;
import de.fau.cs.mad.fablab.rest.core.User;
import io.dropwizard.auth.Auth;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Api to register for machine usage.
 */
@Path("/toolUsage")
public interface ToolUsageApi {

    @GET
    @Path("/{toolId}/")
    @Produces(MediaType.APPLICATION_JSON)
    List<ToolUsage> getUsageForTool(@PathParam("toolId") long toolId);

    @GET
    @Path("/{toolId}/{usageId}/")
    @Produces(MediaType.APPLICATION_JSON)
    ToolUsage getUsage(@PathParam("toolId") long toolId, @PathParam("usageId") long usageId);

    @PUT
    @Path("/{toolId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    ToolUsage addUsage(@Auth(required = false) User user,
                       @QueryParam("token") String token,
                       @PathParam("toolId") long toolId, ToolUsage usage);

    @DELETE
    @Path("/{toolId}/{usageId}")
    @Produces(MediaType.APPLICATION_JSON)
    Response removeUsage(@Auth(required = false) User user,
                         @QueryParam("token") String token,
                         @PathParam("toolId") long toolId,
                         @PathParam("usageId") long usageId);

    @DELETE
    @Path("/{toolId}")
    @Produces(MediaType.APPLICATION_JSON)
    Response removeUsagesForTool(@Auth User user,
                                 @PathParam("toolId") long toolId);

    @POST
    @Path("/{toolId}/{usageId}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    Response moveAfter(@Auth User user, @PathParam("toolId") long toolId,
                       @PathParam("usageId") long usageId,
                       @QueryParam("afterId") long afterId);


    @GET
    @Path("/tools/")
    @Produces(MediaType.APPLICATION_JSON)
    List<FabTool> getEnabledTools();

    @POST
    @Path("/tools/{toolId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Response setToolEnabled(@Auth User user, @PathParam("toolId") long toolId, @QueryParam("enable") boolean enable);
}
