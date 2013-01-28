package reddit;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ChildData {

    private String body;

    public void setBody(final String body) {
        this.body = body;
    }

    public String getBody() {
        return this.body;
    }
}
