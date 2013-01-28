package reddit;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {

    private List<Child> children;

    public void setChildren(final List<Child> children) {
        this.children = children;
    }

    public List<Child> getChildren() {
        return this.children;
    }

}
