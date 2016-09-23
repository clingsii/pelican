package com.cl.pelican.config;

import com.cl.pelican.rest.Resource;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by Ling Cao on 2016/9/23.
 */
public class APIApplication extends ResourceConfig {

    public APIApplication() {

        register(Resource.class);

        register(JacksonJsonProvider.class);

    }
}
