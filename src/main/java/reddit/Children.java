package reddit;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Children {

    private ChildData childData;

    public void setChildData(final ChildData childData) {
        this.childData = childData;
    }

    public ChildData getChildData() {
        return this.childData;
    }

}
