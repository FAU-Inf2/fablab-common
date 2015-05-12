
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
 * Position data such as a postal address or geographic coordinates
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "address",
    "lat",
    "lon"
})
public class Location {

    /**
     * The postal address of your space (street, block, housenumber, zip code, city, whatever you usually need in your country, and the country itself).<br>Examples: <ul><li>Netzladen e.V., Breite Stra\u00dfe 74, 53111 Bonn, Germany</li></ul>
     * 
     */
    @JsonProperty("address")
    private String address;
    /**
     * Latitude of your space location, in degree with decimal places. Use positive values for locations north of the equator, negative values for locations south of equator.
     * (Required)
     * 
     */
    @JsonProperty("lat")
    private Double lat;
    /**
     * Longitude of your space location, in degree with decimal places. Use positive values for locations west of Greenwich, and negative values for locations east of Greenwich.
     * (Required)
     * 
     */
    @JsonProperty("lon")
    private Double lon;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The postal address of your space (street, block, housenumber, zip code, city, whatever you usually need in your country, and the country itself).<br>Examples: <ul><li>Netzladen e.V., Breite Stra\u00dfe 74, 53111 Bonn, Germany</li></ul>
     * 
     * @return
     *     The address
     */
    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    /**
     * The postal address of your space (street, block, housenumber, zip code, city, whatever you usually need in your country, and the country itself).<br>Examples: <ul><li>Netzladen e.V., Breite Stra\u00dfe 74, 53111 Bonn, Germany</li></ul>
     * 
     * @param address
     *     The address
     */
    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Latitude of your space location, in degree with decimal places. Use positive values for locations north of the equator, negative values for locations south of equator.
     * (Required)
     * 
     * @return
     *     The lat
     */
    @JsonProperty("lat")
    public Double getLat() {
        return lat;
    }

    /**
     * Latitude of your space location, in degree with decimal places. Use positive values for locations north of the equator, negative values for locations south of equator.
     * (Required)
     * 
     * @param lat
     *     The lat
     */
    @JsonProperty("lat")
    public void setLat(Double lat) {
        this.lat = lat;
    }

    /**
     * Longitude of your space location, in degree with decimal places. Use positive values for locations west of Greenwich, and negative values for locations east of Greenwich.
     * (Required)
     * 
     * @return
     *     The lon
     */
    @JsonProperty("lon")
    public Double getLon() {
        return lon;
    }

    /**
     * Longitude of your space location, in degree with decimal places. Use positive values for locations west of Greenwich, and negative values for locations east of Greenwich.
     * (Required)
     * 
     * @param lon
     *     The lon
     */
    @JsonProperty("lon")
    public void setLon(Double lon) {
        this.lon = lon;
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
        return new HashCodeBuilder().append(address).append(lat).append(lon).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Location) == false) {
            return false;
        }
        Location rhs = ((Location) other);
        return new EqualsBuilder().append(address, rhs.address).append(lat, rhs.lat).append(lon, rhs.lon).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
