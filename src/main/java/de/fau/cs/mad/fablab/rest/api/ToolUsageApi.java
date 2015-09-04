package de.fau.cs.mad.fablab.rest.api;

import de.fau.cs.mad.fablab.rest.core.ToolUsage;

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
    @Produces(MediaType.APPLICATION_JSON)
    ToolUsage addUsage(@PathParam("toolId") long toolId, ToolUsage usage);

    @DELETE
    @Path("/{toolId}/{usageId}")
    @Produces(MediaType.APPLICATION_JSON)
    Response removeUsage(@PathParam("toolId") long toolId, @PathParam("usageId") long usageId);

    @DELETE
    @Path("/{toolId}")
    @Produces(MediaType.APPLICATION_JSON)
    Response removeUsagesForTool(@PathParam("toolId") long toolId);
}
