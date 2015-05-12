
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
 * A flag indicating if the hackerspace uses SpaceFED, a federated login scheme so that visiting hackers can use the space WiFi with their home space credentials.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "spacenet",
    "spacesaml",
    "spacephone"
})
public class Spacefed {

    /**
     * See the <a target="_blank" href="https://spacefed.net/wiki/index.php/Category:Howto/Spacenet">wiki</a>.
     * (Required)
     * 
     */
    @JsonProperty("spacenet")
    private Boolean spacenet;
    /**
     * See the <a target="_blank" href="https://spacefed.net/wiki/index.php/Category:Howto/Spacesaml">wiki</a>.
     * (Required)
     * 
     */
    @JsonProperty("spacesaml")
    private Boolean spacesaml;
    /**
     * See the <a target="_blank" href="https://spacefed.net/wiki/index.php/Category:Howto/Spacephone">wiki</a>.
     * (Required)
     * 
     */
    @JsonProperty("spacephone")
    private Boolean spacephone;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * See the <a target="_blank" href="https://spacefed.net/wiki/index.php/Category:Howto/Spacenet">wiki</a>.
     * (Required)
     * 
     * @return
     *     The spacenet
     */
    @JsonProperty("spacenet")
    public Boolean getSpacenet() {
        return spacenet;
    }

    /**
     * See the <a target="_blank" href="https://spacefed.net/wiki/index.php/Category:Howto/Spacenet">wiki</a>.
     * (Required)
     * 
     * @param spacenet
     *     The spacenet
     */
    @JsonProperty("spacenet")
    public void setSpacenet(Boolean spacenet) {
        this.spacenet = spacenet;
    }

    /**
     * See the <a target="_blank" href="https://spacefed.net/wiki/index.php/Category:Howto/Spacesaml">wiki</a>.
     * (Required)
     * 
     * @return
     *     The spacesaml
     */
    @JsonProperty("spacesaml")
    public Boolean getSpacesaml() {
        return spacesaml;
    }

    /**
     * See the <a target="_blank" href="https://spacefed.net/wiki/index.php/Category:Howto/Spacesaml">wiki</a>.
     * (Required)
     * 
     * @param spacesaml
     *     The spacesaml
     */
    @JsonProperty("spacesaml")
    public void setSpacesaml(Boolean spacesaml) {
        this.spacesaml = spacesaml;
    }

    /**
     * See the <a target="_blank" href="https://spacefed.net/wiki/index.php/Category:Howto/Spacephone">wiki</a>.
     * (Required)
     * 
     * @return
     *     The spacephone
     */
    @JsonProperty("spacephone")
    public Boolean getSpacephone() {
        return spacephone;
    }

    /**
     * See the <a target="_blank" href="https://spacefed.net/wiki/index.php/Category:Howto/Spacephone">wiki</a>.
     * (Required)
     * 
     * @param spacephone
     *     The spacephone
     */
    @JsonProperty("spacephone")
    public void setSpacephone(Boolean spacephone) {
        this.spacephone = spacephone;
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
        return new HashCodeBuilder().append(spacenet).append(spacesaml).append(spacephone).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Spacefed) == false) {
            return false;
        }
        Spacefed rhs = ((Spacefed) other);
        return new EqualsBuilder().append(spacenet, rhs.spacenet).append(spacesaml, rhs.spacesaml).append(spacephone, rhs.spacephone).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
