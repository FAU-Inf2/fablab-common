
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "name",
    "mac"
})
public class Machine {

    /**
     * The machine name.
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * The machine's MAC address of the format <samp>D3:3A:DB:EE:FF:00</samp>.
     * (Required)
     * 
     */
    @JsonProperty("mac")
    private String mac;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The machine name.
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The machine name.
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The machine's MAC address of the format <samp>D3:3A:DB:EE:FF:00</samp>.
     * (Required)
     * 
     * @return
     *     The mac
     */
    @JsonProperty("mac")
    public String getMac() {
        return mac;
    }

    /**
     * The machine's MAC address of the format <samp>D3:3A:DB:EE:FF:00</samp>.
     * (Required)
     * 
     * @param mac
     *     The mac
     */
    @JsonProperty("mac")
    public void setMac(String mac) {
        this.mac = mac;
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
        return new HashCodeBuilder().append(name).append(mac).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Machine) == false) {
            return false;
        }
        Machine rhs = ((Machine) other);
        return new EqualsBuilder().append(name, rhs.name).append(mac, rhs.mac).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
