package org.acme;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;


/**
 * To use it via injection.
 *
 * {@code
 *     @Inject
 *     @RestClient
 *     MyRemoteService myRemoteService;
 *
 *     public void doSomething() {
 *         Set<MyRemoteService.Extension> restClientExtensions = myRemoteService.getExtensionsById("io.quarkus:quarkus-rest-client");
 *     }
 * }
 */
//(baseUri = "https://stage.code.quarkus.io/api")
@RegisterRestClient(configKey="extensions-api")
public interface MyRemoteService {

    @GET
    @Path("/hello-resteasy")
    @Produces(MediaType.TEXT_PLAIN)
    String greeting();
}
