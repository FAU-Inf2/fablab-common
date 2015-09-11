package de.fau.cs.mad.fablab.rest.api;

import de.fau.cs.mad.fablab.rest.core.ProjectFile;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("projects")
public interface ProjectsApi {

    @POST
    @Path("/create")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    String createProject(ProjectFile project);
}
