
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


/**
 * The wind direction in degrees. Use this <a href="https://github.com/slopjong/OpenSpaceLint/issues/80" target="_blank_">mapping</a> to convert the degrees into a string.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "value",
    "unit"
})
public class Direction {

    /**
     * The sensor value
     * (Required)
     * 
     */
    @JsonProperty("value")
    private Double value;
    /**
     * The unit of the sensor value. You should always define the unit though if the sensor is a flag of a boolean type then you can of course omit it.
     * (Required)
     * 
     */
    @JsonProperty("unit")
    private Direction.Unit unit;
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
     * The unit of the sensor value. You should always define the unit though if the sensor is a flag of a boolean type then you can of course omit it.
     * (Required)
     * 
     * @return
     *     The unit
     */
    @JsonProperty("unit")
    public Direction.Unit getUnit() {
        return unit;
    }

    /**
     * The unit of the sensor value. You should always define the unit though if the sensor is a flag of a boolean type then you can of course omit it.
     * (Required)
     * 
     * @param unit
     *     The unit
     */
    @JsonProperty("unit")
    public void setUnit(Direction.Unit unit) {
        this.unit = unit;
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
        return new HashCodeBuilder().append(value).append(unit).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Direction) == false) {
            return false;
        }
        Direction rhs = ((Direction) other);
        return new EqualsBuilder().append(value, rhs.value).append(unit, rhs.unit).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum Unit {

        __EMPTY__("\u00b0");
        private final String value;
        private static Map<String, Direction.Unit> constants = new HashMap<String, Direction.Unit>();

        static {
            for (Direction.Unit c: values()) {
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
        public static Direction.Unit fromValue(String value) {
            Direction.Unit constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
