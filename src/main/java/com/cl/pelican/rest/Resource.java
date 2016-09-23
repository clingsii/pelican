package com.cl.pelican.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Ling Cao on 2016/9/23.
 */

@Path("/bf")
public class Resource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public boolean exist() {
        return true;
    }

}
