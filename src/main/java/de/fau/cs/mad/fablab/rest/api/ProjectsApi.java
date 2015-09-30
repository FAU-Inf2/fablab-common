package de.fau.cs.mad.fablab.rest.api;

import de.fau.cs.mad.fablab.rest.core.ProjectImageUpload;
import de.fau.cs.mad.fablab.rest.core.ProjectFile;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("projects")
public interface ProjectsApi {

    @POST
    @Path("/create")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    String createProject(ProjectFile project);

    @POST
    @Path("/update/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    @Deprecated
    String updateProjectOld(@PathParam("id")String gistId, ProjectFile project);

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    String updateProject(@PathParam("id")String gistId, ProjectFile project);

    @DELETE
    @Path("/{id}")
    void deleteProject(@PathParam("id")String gistId);

    @POST
    @Path("/image/upload")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    String uploadImage(ProjectImageUpload image);
}
