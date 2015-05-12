
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
 * Specifies options about caching of your SpaceAPI endpoint. Use this if you want to avoid hundreds/thousands of application instances crawling your status.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "schedule"
})
public class Cache {

    /**
     * Cache update cycle. This field must match the basic regular expression <code>^[mhd]\.[0-9]{2}$</code>, where the first field specifies a unit of time (<code>m</code> for 1 minute, <code>h</code> for 1 hour, <code>d</code> for 1 day), and the second field specifies how many of this unit should be skipped between updates. For example, <samp>m.10</samp> means one updates every 10 minutes, <samp>h.03</samp> means one update every 3 hours, and <samp>d.01</samp> means one update every day.
     * (Required)
     * 
     */
    @JsonProperty("schedule")
    private Cache.Schedule schedule;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Cache update cycle. This field must match the basic regular expression <code>^[mhd]\.[0-9]{2}$</code>, where the first field specifies a unit of time (<code>m</code> for 1 minute, <code>h</code> for 1 hour, <code>d</code> for 1 day), and the second field specifies how many of this unit should be skipped between updates. For example, <samp>m.10</samp> means one updates every 10 minutes, <samp>h.03</samp> means one update every 3 hours, and <samp>d.01</samp> means one update every day.
     * (Required)
     * 
     * @return
     *     The schedule
     */
    @JsonProperty("schedule")
    public Cache.Schedule getSchedule() {
        return schedule;
    }

    /**
     * Cache update cycle. This field must match the basic regular expression <code>^[mhd]\.[0-9]{2}$</code>, where the first field specifies a unit of time (<code>m</code> for 1 minute, <code>h</code> for 1 hour, <code>d</code> for 1 day), and the second field specifies how many of this unit should be skipped between updates. For example, <samp>m.10</samp> means one updates every 10 minutes, <samp>h.03</samp> means one update every 3 hours, and <samp>d.01</samp> means one update every day.
     * (Required)
     * 
     * @param schedule
     *     The schedule
     */
    @JsonProperty("schedule")
    public void setSchedule(Cache.Schedule schedule) {
        this.schedule = schedule;
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
        return new HashCodeBuilder().append(schedule).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Cache) == false) {
            return false;
        }
        Cache rhs = ((Cache) other);
        return new EqualsBuilder().append(schedule, rhs.schedule).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum Schedule {

        M_02("m.02"),
        M_05("m.05"),
        M_10("m.10"),
        M_15("m.15"),
        M_30("m.30"),
        H_01("h.01"),
        H_02("h.02"),
        H_04("h.04"),
        H_08("h.08"),
        H_12("h.12"),
        D_01("d.01");
        private final String value;
        private static Map<String, Cache.Schedule> constants = new HashMap<String, Cache.Schedule>();

        static {
            for (Cache.Schedule c: values()) {
                constants.put(c.value, c);
            }
        }

        private Schedule(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static Cache.Schedule fromValue(String value) {
            Cache.Schedule constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
