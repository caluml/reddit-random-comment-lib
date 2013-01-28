package reddit;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Child {

    private ChildData data;

    public void setData(final ChildData data) {
        this.data = data;
    }

    public ChildData getData() {
        return this.data;
    }
}
