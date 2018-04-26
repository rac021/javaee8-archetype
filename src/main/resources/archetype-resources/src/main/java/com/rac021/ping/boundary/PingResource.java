package com.rac021.ping.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author R.YAHIAOUI
 */
@Path("ping")
public class PingResource {

    @GET
    public String ping() {
        return " Pong From Java EE 8";
    }

}
