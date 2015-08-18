package de.fau.cs.mad.fablab.rest.api;

import de.fau.cs.mad.fablab.rest.core.User;
import io.dropwizard.auth.Auth;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * API for authentication and requesting user roles
 */
@Path("/user")
public interface UserApi {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  User getUserInfo(@Auth User user);

}
