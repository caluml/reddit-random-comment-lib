package reddit;

import java.util.List;
import java.util.Random;

import org.jboss.resteasy.client.ProxyFactory;
import org.jboss.resteasy.plugins.providers.RegisterBuiltin;
import org.jboss.resteasy.spi.ResteasyProviderFactory;
import org.junit.Test;

public class RedditTest {

    @Test
    public void Can_get_random_comment() {
        RegisterBuiltin.register(ResteasyProviderFactory.getInstance());

        final RedditApi client = ProxyFactory.create(RedditApi.class, "http://api.reddit.com/");

        final RedditComments response = client.getComments();

        final Data data = response.getData();
        final List<Child> children = data.getChildren();
        final int numChildren = children.size();
        final Child child = children.get(new Random().nextInt(numChildren));
        final ChildData data2 = child.getData();
        final String body = data2.getBody();

        System.out.println(body.trim());
    }
}
