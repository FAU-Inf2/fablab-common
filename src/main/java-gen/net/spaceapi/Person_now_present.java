
package net.spaceapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "value",
    "location",
    "name",
    "names",
    "description"
})
public class Person_now_present {

    /**
     * The amount of present people.
     * (Required)
     * 
     */
    @JsonProperty("value")
    private Double value;
    /**
     * If you use multiple sensor instances for different rooms, use this field to indicate the location.
     * 
     */
    @JsonProperty("location")
    private String location;
    /**
     * Give this sensor a name if necessary at all. Use the location field for the rooms. This field is not intended to be used for names of hackerspace members. Use the field 'names' instead.
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * List of hackerspace members that are currently occupying the space.
     * 
     */
    @JsonProperty("names")
    private List<String> names = new ArrayList<String>();
    /**
     * An extra field that you can use to attach some additional information to this sensor instance.
     * 
     */
    @JsonProperty("description")
    private String description;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The amount of present people.
     * (Required)
     * 
     * @return
     *     The value
     */
    @JsonProperty("value")
    public Double getValue() {
        return value;
    }

    /**
     * The amount of present people.
     * (Required)
     * 
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * If you use multiple sensor instances for different rooms, use this field to indicate the location.
     * 
     * @return
     *     The location
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * If you use multiple sensor instances for different rooms, use this field to indicate the location.
     * 
     * @param location
     *     The location
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Give this sensor a name if necessary at all. Use the location field for the rooms. This field is not intended to be used for names of hackerspace members. Use the field 'names' instead.
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Give this sensor a name if necessary at all. Use the location field for the rooms. This field is not intended to be used for names of hackerspace members. Use the field 'names' instead.
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * List of hackerspace members that are currently occupying the space.
     * 
     * @return
     *     The names
     */
    @JsonProperty("names")
    public List<String> getNames() {
        return names;
    }

    /**
     * List of hackerspace members that are currently occupying the space.
     * 
     * @param names
     *     The names
     */
    @JsonProperty("names")
    public void setNames(List<String> names) {
        this.names = names;
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
        return new HashCodeBuilder().append(value).append(location).append(name).append(names).append(description).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Person_now_present) == false) {
            return false;
        }
        Person_now_present rhs = ((Person_now_present) other);
        return new EqualsBuilder().append(value, rhs.value).append(location, rhs.location).append(name, rhs.name).append(names, rhs.names).append(description, rhs.description).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
