
package net.spaceapi;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "value",
    "unit",
    "location",
    "name",
    "description"
})
public class Beverage_supply {

    /**
     * The sensor value
     * (Required)
     * 
     */
    @JsonProperty("value")
    private Double value;
    /**
     * The unit, either <samp>btl</samp> for bottles or <samp>crt</samp> for crates.
     * (Required)
     * 
     */
    @JsonProperty("unit")
    private Beverage_supply.Unit unit;
    /**
     * The location of your sensor such as <samp>Room 1</samp> or <samp>Room 2</samp> or <samp>Room 3</samp>, <samp>Roof</samp> or <samp>Room 1</samp>.
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
     * The sensor value
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
     * The sensor value
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
     * The unit, either <samp>btl</samp> for bottles or <samp>crt</samp> for crates.
     * (Required)
     * 
     * @return
     *     The unit
     */
    @JsonProperty("unit")
    public Beverage_supply.Unit getUnit() {
        return unit;
    }

    /**
     * The unit, either <samp>btl</samp> for bottles or <samp>crt</samp> for crates.
     * (Required)
     * 
     * @param unit
     *     The unit
     */
    @JsonProperty("unit")
    public void setUnit(Beverage_supply.Unit unit) {
        this.unit = unit;
    }

    /**
     * The location of your sensor such as <samp>Room 1</samp> or <samp>Room 2</samp> or <samp>Room 3</samp>, <samp>Roof</samp> or <samp>Room 1</samp>.
     * 
     * @return
     *     The location
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * The location of your sensor such as <samp>Room 1</samp> or <samp>Room 2</samp> or <samp>Room 3</samp>, <samp>Roof</samp> or <samp>Room 1</samp>.
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
        return new HashCodeBuilder().append(value).append(unit).append(location).append(name).append(description).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Beverage_supply) == false) {
            return false;
        }
        Beverage_supply rhs = ((Beverage_supply) other);
        return new EqualsBuilder().append(value, rhs.value).append(unit, rhs.unit).append(location, rhs.location).append(name, rhs.name).append(description, rhs.description).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum Unit {

        BTL("btl"),
        CRT("crt");
        private final String value;
        private static Map<String, Beverage_supply.Unit> constants = new HashMap<String, Beverage_supply.Unit>();

        static {
            for (Beverage_supply.Unit c: values()) {
                constants.put(c.value, c);
            }
        }

        private Unit(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static Beverage_supply.Unit fromValue(String value) {
            Beverage_supply.Unit constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
