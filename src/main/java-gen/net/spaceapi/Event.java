
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
    "type",
    "timestamp",
    "extra"
})
public class Event {

    /**
     * Name or other identity of the subject (e.g. <samp>J. Random Hacker</samp>, <samp>fridge</samp>, <samp>3D printer</samp>, \u2026)
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * Action (e.g. <samp>check-in</samp>, <samp>check-out</samp>, <samp>finish-print</samp>, \u2026). Define your own actions and use them consistently, canonical actions are not (yet) specified
     * (Required)
     * 
     */
    @JsonProperty("type")
    private String type;
    /**
     * Unix timestamp when the event occured
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    private Double timestamp;
    /**
     * A custom text field to give more information about the event
     * 
     */
    @JsonProperty("extra")
    private String extra;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Name or other identity of the subject (e.g. <samp>J. Random Hacker</samp>, <samp>fridge</samp>, <samp>3D printer</samp>, \u2026)
     * (Required)
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name or other identity of the subject (e.g. <samp>J. Random Hacker</samp>, <samp>fridge</samp>, <samp>3D printer</samp>, \u2026)
     * (Required)
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Action (e.g. <samp>check-in</samp>, <samp>check-out</samp>, <samp>finish-print</samp>, \u2026). Define your own actions and use them consistently, canonical actions are not (yet) specified
     * (Required)
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Action (e.g. <samp>check-in</samp>, <samp>check-out</samp>, <samp>finish-print</samp>, \u2026). Define your own actions and use them consistently, canonical actions are not (yet) specified
     * (Required)
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Unix timestamp when the event occured
     * (Required)
     * 
     * @return
     *     The timestamp
     */
    @JsonProperty("timestamp")
    public Double getTimestamp() {
        return timestamp;
    }

    /**
     * Unix timestamp when the event occured
     * (Required)
     * 
     * @param timestamp
     *     The timestamp
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Double timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * A custom text field to give more information about the event
     * 
     * @return
     *     The extra
     */
    @JsonProperty("extra")
    public String getExtra() {
        return extra;
    }

    /**
     * A custom text field to give more information about the event
     * 
     * @param extra
     *     The extra
     */
    @JsonProperty("extra")
    public void setExtra(String extra) {
        this.extra = extra;
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
        return new HashCodeBuilder().append(name).append(type).append(timestamp).append(extra).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Event) == false) {
            return false;
        }
        Event rhs = ((Event) other);
        return new EqualsBuilder().append(name, rhs.name).append(type, rhs.type).append(timestamp, rhs.timestamp).append(extra, rhs.extra).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
