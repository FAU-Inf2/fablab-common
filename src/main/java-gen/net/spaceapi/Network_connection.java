
package net.spaceapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "type",
    "value",
    "machines",
    "location",
    "name",
    "description"
})
public class Network_connection {

    /**
     * This field is optional but you can use it to the network type such as <samp>wifi</samp> or <samp>cable</samp>. You can even expose the number of <a href="https://spacefed.net/wiki/index.php/Spacenet" target="_blank">spacenet</a>-authenticated connections.
     * 
     */
    @JsonProperty("type")
    private Network_connection.Type type;
    /**
     * The amount of network connections.
     * (Required)
     * 
     */
    @JsonProperty("value")
    private Double value;
    /**
     * The machines that are currently connected with the network.
     * 
     */
    @JsonProperty("machines")
    private List<Machine> machines = new ArrayList<Machine>();
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
     * This field is optional but you can use it to the network type such as <samp>wifi</samp> or <samp>cable</samp>. You can even expose the number of <a href="https://spacefed.net/wiki/index.php/Spacenet" target="_blank">spacenet</a>-authenticated connections.
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public Network_connection.Type getType() {
        return type;
    }

    /**
     * This field is optional but you can use it to the network type such as <samp>wifi</samp> or <samp>cable</samp>. You can even expose the number of <a href="https://spacefed.net/wiki/index.php/Spacenet" target="_blank">spacenet</a>-authenticated connections.
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(Network_connection.Type type) {
        this.type = type;
    }

    /**
     * The amount of network connections.
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
     * The amount of network connections.
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
     * The machines that are currently connected with the network.
     * 
     * @return
     *     The machines
     */
    @JsonProperty("machines")
    public List<Machine> getMachines() {
        return machines;
    }

    /**
     * The machines that are currently connected with the network.
     * 
     * @param machines
     *     The machines
     */
    @JsonProperty("machines")
    public void setMachines(List<Machine> machines) {
        this.machines = machines;
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
        return new HashCodeBuilder().append(type).append(value).append(machines).append(location).append(name).append(description).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Network_connection) == false) {
            return false;
        }
        Network_connection rhs = ((Network_connection) other);
        return new EqualsBuilder().append(type, rhs.type).append(value, rhs.value).append(machines, rhs.machines).append(location, rhs.location).append(name, rhs.name).append(description, rhs.description).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum Type {

        WIFI("wifi"),
        CABLE("cable"),
        SPACENET("spacenet");
        private final String value;
        private static Map<String, Network_connection.Type> constants = new HashMap<String, Network_connection.Type>();

        static {
            for (Network_connection.Type c: values()) {
                constants.put(c.value, c);
            }
        }

        private Type(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static Network_connection.Type fromValue(String value) {
            Network_connection.Type constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
