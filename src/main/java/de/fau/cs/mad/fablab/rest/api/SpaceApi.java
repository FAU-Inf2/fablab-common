package de.fau.cs.mad.fablab.rest.api;

import net.spaceapi.HackerSpace;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Interface for accessing (remote) SpaceAPI
 * Information about SpaceAPI: https://spaceapi.net/
 */
@Path("/spaceapi")
@Produces(MediaType.APPLICATION_JSON)
public interface SpaceApi {

    @GET
    @Path("{space}")
    @Produces(MediaType.APPLICATION_JSON)
    HackerSpace getSpace(@PathParam("space") String space);
}
