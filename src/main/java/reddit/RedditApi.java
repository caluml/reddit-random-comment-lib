package reddit;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Produces("application/json")
public interface RedditApi {

    @Path("/comments")
    @GET
    RedditComments getComments();
}
