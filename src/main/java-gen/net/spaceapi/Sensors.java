
package net.spaceapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * Data of various sensors in your space (e.g. temperature, humidity, amount of Club-Mate left, \u2026). The only canonical property is the <em>temp</em> property, additional sensor types may be defined by you. In this case, you are requested to share your definition for inclusion in this specification.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "temperature",
    "door_locked",
    "barometer",
    "radiation",
    "humidity",
    "beverage_supply",
    "power_consumption",
    "wind",
    "network_connections",
    "account_balance",
    "total_member_count",
    "people_now_present"
})
public class Sensors {

    /**
     * Temperature sensor. To convert from one unit of temperature to another consider <a href="http://en.wikipedia.org/wiki/Temperature_conversion_formulas" target="_blank">Wikipedia</a>.
     * 
     */
    @JsonProperty("temperature")
    private List<Temperature> temperature = new ArrayList<Temperature>();
    /**
     * Sensor type to indicate if a certain door is locked.
     * 
     */
    @JsonProperty("door_locked")
    private List<Door_locked> door_locked = new ArrayList<Door_locked>();
    /**
     * Barometer sensor
     * 
     */
    @JsonProperty("barometer")
    private List<Barometer> barometer = new ArrayList<Barometer>();
    /**
     * Compound radiation sensor. Check this <a rel="nofollow" href="https://sites.google.com/site/diygeigercounter/gm-tubes-supported" target="_blank">resource</a>.
     * 
     */
    @JsonProperty("radiation")
    private Radiation radiation;
    /**
     * Humidity sensor
     * 
     */
    @JsonProperty("humidity")
    private List<Humidity> humidity = new ArrayList<Humidity>();
    /**
     * How much Mate and beer is in your fridge?
     * 
     */
    @JsonProperty("beverage_supply")
    private List<Beverage_supply> beverage_supply = new ArrayList<Beverage_supply>();
    /**
     * The power consumption of a specific device or of your whole space.
     * 
     */
    @JsonProperty("power_consumption")
    private List<Power_consumption> power_consumption = new ArrayList<Power_consumption>();
    /**
     * Your wind sensor.
     * 
     */
    @JsonProperty("wind")
    private List<Wind> wind = new ArrayList<Wind>();
    /**
     * This sensor type is to specify the currently active  ethernet or wireless network devices. You can create different instances for each network type.
     * 
     */
    @JsonProperty("network_connections")
    private List<Network_connection> network_connections = new ArrayList<Network_connection>();
    /**
     * How rich is your hackerspace?
     * 
     */
    @JsonProperty("account_balance")
    private List<Account_balance> account_balance = new ArrayList<Account_balance>();
    /**
     * Specify the number of space members.
     * 
     */
    @JsonProperty("total_member_count")
    private List<Total_member_count> total_member_count = new ArrayList<Total_member_count>();
    /**
     * Specify the number of people that are currently in your space. Optionally you can define a list of names.
     * 
     */
    @JsonProperty("people_now_present")
    private List<Person_now_present> people_now_present = new ArrayList<Person_now_present>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Temperature sensor. To convert from one unit of temperature to another consider <a href="http://en.wikipedia.org/wiki/Temperature_conversion_formulas" target="_blank">Wikipedia</a>.
     * 
     * @return
     *     The temperature
     */
    @JsonProperty("temperature")
    public List<Temperature> getTemperature() {
        return temperature;
    }

    /**
     * Temperature sensor. To convert from one unit of temperature to another consider <a href="http://en.wikipedia.org/wiki/Temperature_conversion_formulas" target="_blank">Wikipedia</a>.
     * 
     * @param temperature
     *     The temperature
     */
    @JsonProperty("temperature")
    public void setTemperature(List<Temperature> temperature) {
        this.temperature = temperature;
    }

    /**
     * Sensor type to indicate if a certain door is locked.
     * 
     * @return
     *     The door_locked
     */
    @JsonProperty("door_locked")
    public List<Door_locked> getDoor_locked() {
        return door_locked;
    }

    /**
     * Sensor type to indicate if a certain door is locked.
     * 
     * @param door_locked
     *     The door_locked
     */
    @JsonProperty("door_locked")
    public void setDoor_locked(List<Door_locked> door_locked) {
        this.door_locked = door_locked;
    }

    /**
     * Barometer sensor
     * 
     * @return
     *     The barometer
     */
    @JsonProperty("barometer")
    public List<Barometer> getBarometer() {
        return barometer;
    }

    /**
     * Barometer sensor
     * 
     * @param barometer
     *     The barometer
     */
    @JsonProperty("barometer")
    public void setBarometer(List<Barometer> barometer) {
        this.barometer = barometer;
    }

    /**
     * Compound radiation sensor. Check this <a rel="nofollow" href="https://sites.google.com/site/diygeigercounter/gm-tubes-supported" target="_blank">resource</a>.
     * 
     * @return
     *     The radiation
     */
    @JsonProperty("radiation")
    public Radiation getRadiation() {
        return radiation;
    }

    /**
     * Compound radiation sensor. Check this <a rel="nofollow" href="https://sites.google.com/site/diygeigercounter/gm-tubes-supported" target="_blank">resource</a>.
     * 
     * @param radiation
     *     The radiation
     */
    @JsonProperty("radiation")
    public void setRadiation(Radiation radiation) {
        this.radiation = radiation;
    }

    /**
     * Humidity sensor
     * 
     * @return
     *     The humidity
     */
    @JsonProperty("humidity")
    public List<Humidity> getHumidity() {
        return humidity;
    }

    /**
     * Humidity sensor
     * 
     * @param humidity
     *     The humidity
     */
    @JsonProperty("humidity")
    public void setHumidity(List<Humidity> humidity) {
        this.humidity = humidity;
    }

    /**
     * How much Mate and beer is in your fridge?
     * 
     * @return
     *     The beverage_supply
     */
    @JsonProperty("beverage_supply")
    public List<Beverage_supply> getBeverage_supply() {
        return beverage_supply;
    }

    /**
     * How much Mate and beer is in your fridge?
     * 
     * @param beverage_supply
     *     The beverage_supply
     */
    @JsonProperty("beverage_supply")
    public void setBeverage_supply(List<Beverage_supply> beverage_supply) {
        this.beverage_supply = beverage_supply;
    }

    /**
     * The power consumption of a specific device or of your whole space.
     * 
     * @return
     *     The power_consumption
     */
    @JsonProperty("power_consumption")
    public List<Power_consumption> getPower_consumption() {
        return power_consumption;
    }

    /**
     * The power consumption of a specific device or of your whole space.
     * 
     * @param power_consumption
     *     The power_consumption
     */
    @JsonProperty("power_consumption")
    public void setPower_consumption(List<Power_consumption> power_consumption) {
        this.power_consumption = power_consumption;
    }

    /**
     * Your wind sensor.
     * 
     * @return
     *     The wind
     */
    @JsonProperty("wind")
    public List<Wind> getWind() {
        return wind;
    }

    /**
     * Your wind sensor.
     * 
     * @param wind
     *     The wind
     */
    @JsonProperty("wind")
    public void setWind(List<Wind> wind) {
        this.wind = wind;
    }

    /**
     * This sensor type is to specify the currently active  ethernet or wireless network devices. You can create different instances for each network type.
     * 
     * @return
     *     The network_connections
     */
    @JsonProperty("network_connections")
    public List<Network_connection> getNetwork_connections() {
        return network_connections;
    }

    /**
     * This sensor type is to specify the currently active  ethernet or wireless network devices. You can create different instances for each network type.
     * 
     * @param network_connections
     *     The network_connections
     */
    @JsonProperty("network_connections")
    public void setNetwork_connections(List<Network_connection> network_connections) {
        this.network_connections = network_connections;
    }

    /**
     * How rich is your hackerspace?
     * 
     * @return
     *     The account_balance
     */
    @JsonProperty("account_balance")
    public List<Account_balance> getAccount_balance() {
        return account_balance;
    }

    /**
     * How rich is your hackerspace?
     * 
     * @param account_balance
     *     The account_balance
     */
    @JsonProperty("account_balance")
    public void setAccount_balance(List<Account_balance> account_balance) {
        this.account_balance = account_balance;
    }

    /**
     * Specify the number of space members.
     * 
     * @return
     *     The total_member_count
     */
    @JsonProperty("total_member_count")
    public List<Total_member_count> getTotal_member_count() {
        return total_member_count;
    }

    /**
     * Specify the number of space members.
     * 
     * @param total_member_count
     *     The total_member_count
     */
    @JsonProperty("total_member_count")
    public void setTotal_member_count(List<Total_member_count> total_member_count) {
        this.total_member_count = total_member_count;
    }

    /**
     * Specify the number of people that are currently in your space. Optionally you can define a list of names.
     * 
     * @return
     *     The people_now_present
     */
    @JsonProperty("people_now_present")
    public List<Person_now_present> getPeople_now_present() {
        return people_now_present;
    }

    /**
     * Specify the number of people that are currently in your space. Optionally you can define a list of names.
     * 
     * @param people_now_present
     *     The people_now_present
     */
    @JsonProperty("people_now_present")
    public void setPeople_now_present(List<Person_now_present> people_now_present) {
        this.people_now_present = people_now_present;
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
        return new HashCodeBuilder().append(temperature).append(door_locked).append(barometer).append(radiation).append(humidity).append(beverage_supply).append(power_consumption).append(wind).append(network_connections).append(account_balance).append(total_member_count).append(people_now_present).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sensors) == false) {
            return false;
        }
        Sensors rhs = ((Sensors) other);
        return new EqualsBuilder().append(temperature, rhs.temperature).append(door_locked, rhs.door_locked).append(barometer, rhs.barometer).append(radiation, rhs.radiation).append(humidity, rhs.humidity).append(beverage_supply, rhs.beverage_supply).append(power_consumption, rhs.power_consumption).append(wind, rhs.wind).append(network_connections, rhs.network_connections).append(account_balance, rhs.account_balance).append(total_member_count, rhs.total_member_count).append(people_now_present, rhs.people_now_present).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
