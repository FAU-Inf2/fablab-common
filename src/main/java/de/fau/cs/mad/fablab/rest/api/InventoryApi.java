package de.fau.cs.mad.fablab.rest.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.fau.cs.mad.fablab.rest.core.InventoryItem;
import de.fau.cs.mad.fablab.rest.core.User;
import io.dropwizard.auth.Auth;

@Path("inventory")
public interface InventoryApi {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    InventoryItem add(@Auth User user, InventoryItem obj);

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Boolean deleteAll(@Auth User user);

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    List<InventoryItem> getAll();
}

