
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
    "dead_time",
    "conversion_factor",
    "location",
    "name",
    "description"
})
public class Alpha {

    /**
     * Observed counts per minute (ocpm) or actual radiation value. If the value are the observed counts then the dead_time and conversion_factor fields must be defined as well. CPM formula: <div>cpm = ocpm ( 1 + 1 / (1 - ocpm x dead_time) )</div> Conversion formula: <div>\u00b5Sv/h = cpm x conversion_factor</div>
     * (Required)
     * 
     */
    @JsonProperty("value")
    private Double value;
    /**
     * Choose the appropriate unit for your radiation sensor instance.
     * (Required)
     * 
     */
    @JsonProperty("unit")
    private Alpha.Unit unit;
    /**
     * The dead time in \u00b5s. See the description of the value field to see how to use the dead time.
     * 
     */
    @JsonProperty("dead_time")
    private Double dead_time;
    /**
     * The conversion from the <em>cpm</em> unit to another unit hardly depends on your tube type. See the description of the value field to see how to use the conversion factor. <strong>Note:</strong> only trust your manufacturer if it comes to the actual factor value. The internet seems <a rel="nofollow" href="http://sapporohibaku.wordpress.com/2011/10/15/conversion-factor/" target="_blank">full of wrong copy & pastes</a>, don't even trust your neighbour hackerspace. If in doubt ask the tube manufacturer.
     * 
     */
    @JsonProperty("conversion_factor")
    private Double conversion_factor;
    /**
     * The location of your sensor such as <samp>Outside</samp>, <samp>Inside</samp>, <samp>Ceiling</samp>, <samp>Roof</samp> or <samp>Room 1</samp>.
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
     * Observed counts per minute (ocpm) or actual radiation value. If the value are the observed counts then the dead_time and conversion_factor fields must be defined as well. CPM formula: <div>cpm = ocpm ( 1 + 1 / (1 - ocpm x dead_time) )</div> Conversion formula: <div>\u00b5Sv/h = cpm x conversion_factor</div>
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
     * Observed counts per minute (ocpm) or actual radiation value. If the value are the observed counts then the dead_time and conversion_factor fields must be defined as well. CPM formula: <div>cpm = ocpm ( 1 + 1 / (1 - ocpm x dead_time) )</div> Conversion formula: <div>\u00b5Sv/h = cpm x conversion_factor</div>
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
     * Choose the appropriate unit for your radiation sensor instance.
     * (Required)
     * 
     * @return
     *     The unit
     */
    @JsonProperty("unit")
    public Alpha.Unit getUnit() {
        return unit;
    }

    /**
     * Choose the appropriate unit for your radiation sensor instance.
     * (Required)
     * 
     * @param unit
     *     The unit
     */
    @JsonProperty("unit")
    public void setUnit(Alpha.Unit unit) {
        this.unit = unit;
    }

    /**
     * The dead time in \u00b5s. See the description of the value field to see how to use the dead time.
     * 
     * @return
     *     The dead_time
     */
    @JsonProperty("dead_time")
    public Double getDead_time() {
        return dead_time;
    }

    /**
     * The dead time in \u00b5s. See the description of the value field to see how to use the dead time.
     * 
     * @param dead_time
     *     The dead_time
     */
    @JsonProperty("dead_time")
    public void setDead_time(Double dead_time) {
        this.dead_time = dead_time;
    }

    /**
     * The conversion from the <em>cpm</em> unit to another unit hardly depends on your tube type. See the description of the value field to see how to use the conversion factor. <strong>Note:</strong> only trust your manufacturer if it comes to the actual factor value. The internet seems <a rel="nofollow" href="http://sapporohibaku.wordpress.com/2011/10/15/conversion-factor/" target="_blank">full of wrong copy & pastes</a>, don't even trust your neighbour hackerspace. If in doubt ask the tube manufacturer.
     * 
     * @return
     *     The conversion_factor
     */
    @JsonProperty("conversion_factor")
    public Double getConversion_factor() {
        return conversion_factor;
    }

    /**
     * The conversion from the <em>cpm</em> unit to another unit hardly depends on your tube type. See the description of the value field to see how to use the conversion factor. <strong>Note:</strong> only trust your manufacturer if it comes to the actual factor value. The internet seems <a rel="nofollow" href="http://sapporohibaku.wordpress.com/2011/10/15/conversion-factor/" target="_blank">full of wrong copy & pastes</a>, don't even trust your neighbour hackerspace. If in doubt ask the tube manufacturer.
     * 
     * @param conversion_factor
     *     The conversion_factor
     */
    @JsonProperty("conversion_factor")
    public void setConversion_factor(Double conversion_factor) {
        this.conversion_factor = conversion_factor;
    }

    /**
     * The location of your sensor such as <samp>Outside</samp>, <samp>Inside</samp>, <samp>Ceiling</samp>, <samp>Roof</samp> or <samp>Room 1</samp>.
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
        return new HashCodeBuilder().append(value).append(unit).append(dead_time).append(conversion_factor).append(location).append(name).append(description).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Alpha) == false) {
            return false;
        }
        Alpha rhs = ((Alpha) other);
        return new EqualsBuilder().append(value, rhs.value).append(unit, rhs.unit).append(dead_time, rhs.dead_time).append(conversion_factor, rhs.conversion_factor).append(location, rhs.location).append(name, rhs.name).append(description, rhs.description).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum Unit {

        CPM("cpm"),
        R_H("r/h"),
        SV_H("\u00b5Sv/h"),
        M_SV_A("mSv/a"),
        SV_A("\u00b5Sv/a");
        private final String value;
        private static Map<String, Alpha.Unit> constants = new HashMap<String, Alpha.Unit>();

        static {
            for (Alpha.Unit c: values()) {
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
        public static Alpha.Unit fromValue(String value) {
            Alpha.Unit constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
