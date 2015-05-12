
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


/**
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "speed",
    "gust",
    "direction",
    "elevation"
})
public class Properties {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("speed")
    private Speed speed;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("gust")
    private Gust gust;
    /**
     * The wind direction in degrees. Use this <a href="https://github.com/slopjong/OpenSpaceLint/issues/80" target="_blank_">mapping</a> to convert the degrees into a string.
     * (Required)
     * 
     */
    @JsonProperty("direction")
    private Direction direction;
    /**
     * Height above mean sea level.
     * (Required)
     * 
     */
    @JsonProperty("elevation")
    private Elevation elevation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The speed
     */
    @JsonProperty("speed")
    public Speed getSpeed() {
        return speed;
    }

    /**
     * 
     * (Required)
     * 
     * @param speed
     *     The speed
     */
    @JsonProperty("speed")
    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The gust
     */
    @JsonProperty("gust")
    public Gust getGust() {
        return gust;
    }

    /**
     * 
     * (Required)
     * 
     * @param gust
     *     The gust
     */
    @JsonProperty("gust")
    public void setGust(Gust gust) {
        this.gust = gust;
    }

    /**
     * The wind direction in degrees. Use this <a href="https://github.com/slopjong/OpenSpaceLint/issues/80" target="_blank_">mapping</a> to convert the degrees into a string.
     * (Required)
     * 
     * @return
     *     The direction
     */
    @JsonProperty("direction")
    public Direction getDirection() {
        return direction;
    }

    /**
     * The wind direction in degrees. Use this <a href="https://github.com/slopjong/OpenSpaceLint/issues/80" target="_blank_">mapping</a> to convert the degrees into a string.
     * (Required)
     * 
     * @param direction
     *     The direction
     */
    @JsonProperty("direction")
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    /**
     * Height above mean sea level.
     * (Required)
     * 
     * @return
     *     The elevation
     */
    @JsonProperty("elevation")
    public Elevation getElevation() {
        return elevation;
    }

    /**
     * Height above mean sea level.
     * (Required)
     * 
     * @param elevation
     *     The elevation
     */
    @JsonProperty("elevation")
    public void setElevation(Elevation elevation) {
        this.elevation = elevation;
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
        return new HashCodeBuilder().append(speed).append(gust).append(direction).append(elevation).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Properties) == false) {
            return false;
        }
        Properties rhs = ((Properties) other);
        return new EqualsBuilder().append(speed, rhs.speed).append(gust, rhs.gust).append(direction, rhs.direction).append(elevation, rhs.elevation).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
