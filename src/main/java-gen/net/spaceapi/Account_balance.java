
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
public class Account_balance {

    /**
     * How much?
     * (Required)
     * 
     */
    @JsonProperty("value")
    private Double value;
    /**
     * What's the currency? If your currency is missing open a new <a href="https://github.com/slopjong/OpenSpaceLint/issues" target="_blank">issue</a> and request the addition of your currency according <a href="http://de.wikipedia.org/wiki/ISO_4217" target="_blank">ISO 4217</a>.
     * (Required)
     * 
     */
    @JsonProperty("unit")
    private Account_balance.Unit unit;
    /**
     * If you have more than one account you can use this field to specify where it is.
     * 
     */
    @JsonProperty("location")
    private String location;
    /**
     * Give your sensor instance a name.
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
     * How much?
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
     * How much?
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
     * What's the currency? If your currency is missing open a new <a href="https://github.com/slopjong/OpenSpaceLint/issues" target="_blank">issue</a> and request the addition of your currency according <a href="http://de.wikipedia.org/wiki/ISO_4217" target="_blank">ISO 4217</a>.
     * (Required)
     * 
     * @return
     *     The unit
     */
    @JsonProperty("unit")
    public Account_balance.Unit getUnit() {
        return unit;
    }

    /**
     * What's the currency? If your currency is missing open a new <a href="https://github.com/slopjong/OpenSpaceLint/issues" target="_blank">issue</a> and request the addition of your currency according <a href="http://de.wikipedia.org/wiki/ISO_4217" target="_blank">ISO 4217</a>.
     * (Required)
     * 
     * @param unit
     *     The unit
     */
    @JsonProperty("unit")
    public void setUnit(Account_balance.Unit unit) {
        this.unit = unit;
    }

    /**
     * If you have more than one account you can use this field to specify where it is.
     * 
     * @return
     *     The location
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * If you have more than one account you can use this field to specify where it is.
     * 
     * @param location
     *     The location
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Give your sensor instance a name.
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Give your sensor instance a name.
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
        if ((other instanceof Account_balance) == false) {
            return false;
        }
        Account_balance rhs = ((Account_balance) other);
        return new EqualsBuilder().append(value, rhs.value).append(unit, rhs.unit).append(location, rhs.location).append(name, rhs.name).append(description, rhs.description).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum Unit {

        BTC("BTC"),
        EUR("EUR"),
        USD("USD"),
        GBP("GBP");
        private final String value;
        private static Map<String, Account_balance.Unit> constants = new HashMap<String, Account_balance.Unit>();

        static {
            for (Account_balance.Unit c: values()) {
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
        public static Account_balance.Unit fromValue(String value) {
            Account_balance.Unit constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
