package de.fau.cs.mad.fablab.rest.api;

import de.fau.cs.mad.fablab.rest.core.PlatformType;
import de.fau.cs.mad.fablab.rest.core.UpdateStatus;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * Api to check for newer application version.
 */
@Path("versionCheck")
public interface VersionCheckApi {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    UpdateStatus checkVersion(@QueryParam("platformType") PlatformType platformType, @QueryParam("currentVersion") int currentVersion);
}
