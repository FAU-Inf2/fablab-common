package de.fau.cs.mad.fablab.rest.api;

import de.fau.cs.mad.fablab.rest.entities.News;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Interface for accessing products
 */
@Path("/news")
@Produces(MediaType.APPLICATION_JSON)
public interface NewsApi {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    List<News> getNews();
}
