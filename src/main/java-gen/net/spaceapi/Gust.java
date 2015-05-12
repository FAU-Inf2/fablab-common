
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
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "value",
    "unit"
})
public class Gust {

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
    private Gust.Unit unit;
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
    public Gust.Unit getUnit() {
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
    public void setUnit(Gust.Unit unit) {
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
        if ((other instanceof Gust) == false) {
            return false;
        }
        Gust rhs = ((Gust) other);
        return new EqualsBuilder().append(value, rhs.value).append(unit, rhs.unit).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum Unit {

        M_S("m/s"),
        KM_H("km/h"),
        KN("kn");
        private final String value;
        private static Map<String, Gust.Unit> constants = new HashMap<String, Gust.Unit>();

        static {
            for (Gust.Unit c: values()) {
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
        public static Gust.Unit fromValue(String value) {
            Gust.Unit constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
