
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
    "value",
    "location",
    "name",
    "description"
})
public class Total_member_count {

    /**
     * The amount of your space members.
     * (Required)
     * 
     */
    @JsonProperty("value")
    private Double value;
    /**
     * Specify the location if your hackerspace has different departments (for whatever reason). This field is for one department. Every department should have its own sensor instance.
     * 
     */
    @JsonProperty("location")
    private String location;
    /**
     * You can use this field to specify if this sensor instance counts active or inactive members.
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
     * The amount of your space members.
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
     * The amount of your space members.
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
     * Specify the location if your hackerspace has different departments (for whatever reason). This field is for one department. Every department should have its own sensor instance.
     * 
     * @return
     *     The location
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * Specify the location if your hackerspace has different departments (for whatever reason). This field is for one department. Every department should have its own sensor instance.
     * 
     * @param location
     *     The location
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * You can use this field to specify if this sensor instance counts active or inactive members.
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * You can use this field to specify if this sensor instance counts active or inactive members.
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
        return new HashCodeBuilder().append(value).append(location).append(name).append(description).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Total_member_count) == false) {
            return false;
        }
        Total_member_count rhs = ((Total_member_count) other);
        return new EqualsBuilder().append(value, rhs.value).append(location, rhs.location).append(name, rhs.name).append(description, rhs.description).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
