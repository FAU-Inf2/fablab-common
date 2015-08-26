package de.fau.cs.mad.fablab.rest.api;

import de.fau.cs.mad.fablab.rest.core.MailAddresses;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("data")
public interface DataApi {

    @Deprecated
    @GET
    @Path("/fablab-mail")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    String getFabLabMailAddress();

    @Deprecated
    @GET
    @Path("/feedback-mail")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    String getFeedbackMailAddress();

    @GET
    @Path("/mail-addresses")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    MailAddresses getMailAddresses();
}
