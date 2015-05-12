
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
    "properties",
    "location",
    "name",
    "description"
})
public class Wind {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("properties")
    private Properties properties;
    /**
     * The location of your sensor such as <samp>Outside</samp>, <samp>Inside</samp>, <samp>Ceiling</samp>, <samp>Roof</samp> or <samp>Room 1</samp>.
     * (Required)
     * 
     */
    @JsonProperty("location")
    private String location;
    /**
     * This field is an additional field to give your sensor a name. This can be useful if you have multiple sensors in the same location.
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * An extra field that you can use to attach some additional information to this sensor instance.
     * 
     */
    @JsonProperty("description")
    private String description;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The properties
     */
    @JsonProperty("properties")
    public Properties getProperties() {
        return properties;
    }

    /**
     * 
     * (Required)
     * 
     * @param properties
     *     The properties
     */
    @JsonProperty("properties")
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    /**
     * The location of your sensor such as <samp>Outside</samp>, <samp>Inside</samp>, <samp>Ceiling</samp>, <samp>Roof</samp> or <samp>Room 1</samp>.
     * (Required)
     * 
     * @return
     *     The location
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * The location of your sensor such as <samp>Outside</samp>, <samp>Inside</samp>, <samp>Ceiling</samp>, <samp>Roof</samp> or <samp>Room 1</samp>.
     * (Required)
     * 
     * @param location
     *     The location
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * This field is an additional field to give your sensor a name. This can be useful if you have multiple sensors in the same location.
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * This field is an additional field to give your sensor a name. This can be useful if you have multiple sensors in the same location.
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * An extra field that you can use to attach some additional information to this sensor instance.
     * 
     * @return
     *     The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * An extra field that you can use to attach some additional information to this sensor instance.
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
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
        return new HashCodeBuilder().append(properties).append(location).append(name).append(description).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Wind) == false) {
            return false;
        }
        Wind rhs = ((Wind) other);
        return new EqualsBuilder().append(properties, rhs.properties).append(location, rhs.location).append(name, rhs.name).append(description, rhs.description).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
