
package net.spaceapi;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Icons that show the status graphically
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "open",
    "closed"
})
public class Icon {

    /**
     * The URL to your customized space logo showing an open space
     * (Required)
     * 
     */
    @JsonProperty("open")
    private String open;
    /**
     * The URL to your customized space logo showing a closed space
     * (Required)
     * 
     */
    @JsonProperty("closed")
    private String closed;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The URL to your customized space logo showing an open space
     * (Required)
     * 
     * @return
     *     The open
     */
    @JsonProperty("open")
    public String getOpen() {
        return open;
    }

    /**
     * The URL to your customized space logo showing an open space
     * (Required)
     * 
     * @param open
     *     The open
     */
    @JsonProperty("open")
    public void setOpen(String open) {
        this.open = open;
    }

    /**
     * The URL to your customized space logo showing a closed space
     * (Required)
     * 
     * @return
     *     The closed
     */
    @JsonProperty("closed")
    public String getClosed() {
        return closed;
    }

    /**
     * The URL to your customized space logo showing a closed space
     * (Required)
     * 
     * @param closed
     *     The closed
     */
    @JsonProperty("closed")
    public void setClosed(String closed) {
        this.closed = closed;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(open).append(closed).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Icon) == false) {
            return false;
        }
        Icon rhs = ((Icon) other);
        return new EqualsBuilder().append(open, rhs.open).append(closed, rhs.closed).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
