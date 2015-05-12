
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
    "name",
    "url",
    "type",
    "start",
    "end"
})
public class Radio_show {

    /**
     * The name of the radio show.
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * The stream URL which must end in a filename or a semicolon such as <br><ul><li>http://signal.hackerspaces.org:8090/signal.mp3</li><li>http://85.214.64.213:8060/;</ul>
     * (Required)
     * 
     */
    @JsonProperty("url")
    private String url;
    /**
     * The stream encoder.
     * (Required)
     * 
     */
    @JsonProperty("type")
    private Radio_show.Type type;
    /**
     * Specify the start time by using the <a href="http://en.wikipedia.org/wiki/ISO_8601" target="_blank">ISO 8601</a> standard. This encodes the time as follows: <br><br><ul><li>Combined date and time in UTC: 2013-06-10T10:00Z</li><li>Combined date and time in localtime with the timezone offset: 2013-06-10T12:00+02:00</li><li>Combined date and time in localtime with the timezone offset: 2013-06-10T07:00-03:00</li></ul> The examples refer all to the same time.
     * (Required)
     * 
     */
    @JsonProperty("start")
    private String start;
    /**
     * Specify the end time by using the <a href="http://en.wikipedia.org/wiki/ISO_8601" target="_blank">ISO 8601</a> standard. This encodes the time as follows: <br><br><ul><li>Combined date and time in UTC: 2013-06-10T10:00Z</li><li>Combined date and time in localtime with the timezone offset: 2013-06-10T12:00+02:00</li><li>Combined date and time in localtime with the timezone offset: 2013-06-10T07:00-03:00</li></ul> The examples refer all to the same time.
     * (Required)
     * 
     */
    @JsonProperty("end")
    private String end;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The name of the radio show.
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
     * The name of the radio show.
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
     * The stream URL which must end in a filename or a semicolon such as <br><ul><li>http://signal.hackerspaces.org:8090/signal.mp3</li><li>http://85.214.64.213:8060/;</ul>
     * (Required)
     * 
     * @return
     *     The url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * The stream URL which must end in a filename or a semicolon such as <br><ul><li>http://signal.hackerspaces.org:8090/signal.mp3</li><li>http://85.214.64.213:8060/;</ul>
     * (Required)
     * 
     * @param url
     *     The url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * The stream encoder.
     * (Required)
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public Radio_show.Type getType() {
        return type;
    }

    /**
     * The stream encoder.
     * (Required)
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(Radio_show.Type type) {
        this.type = type;
    }

    /**
     * Specify the start time by using the <a href="http://en.wikipedia.org/wiki/ISO_8601" target="_blank">ISO 8601</a> standard. This encodes the time as follows: <br><br><ul><li>Combined date and time in UTC: 2013-06-10T10:00Z</li><li>Combined date and time in localtime with the timezone offset: 2013-06-10T12:00+02:00</li><li>Combined date and time in localtime with the timezone offset: 2013-06-10T07:00-03:00</li></ul> The examples refer all to the same time.
     * (Required)
     * 
     * @return
     *     The start
     */
    @JsonProperty("start")
    public String getStart() {
        return start;
    }

    /**
     * Specify the start time by using the <a href="http://en.wikipedia.org/wiki/ISO_8601" target="_blank">ISO 8601</a> standard. This encodes the time as follows: <br><br><ul><li>Combined date and time in UTC: 2013-06-10T10:00Z</li><li>Combined date and time in localtime with the timezone offset: 2013-06-10T12:00+02:00</li><li>Combined date and time in localtime with the timezone offset: 2013-06-10T07:00-03:00</li></ul> The examples refer all to the same time.
     * (Required)
     * 
     * @param start
     *     The start
     */
    @JsonProperty("start")
    public void setStart(String start) {
        this.start = start;
    }

    /**
     * Specify the end time by using the <a href="http://en.wikipedia.org/wiki/ISO_8601" target="_blank">ISO 8601</a> standard. This encodes the time as follows: <br><br><ul><li>Combined date and time in UTC: 2013-06-10T10:00Z</li><li>Combined date and time in localtime with the timezone offset: 2013-06-10T12:00+02:00</li><li>Combined date and time in localtime with the timezone offset: 2013-06-10T07:00-03:00</li></ul> The examples refer all to the same time.
     * (Required)
     * 
     * @return
     *     The end
     */
    @JsonProperty("end")
    public String getEnd() {
        return end;
    }

    /**
     * Specify the end time by using the <a href="http://en.wikipedia.org/wiki/ISO_8601" target="_blank">ISO 8601</a> standard. This encodes the time as follows: <br><br><ul><li>Combined date and time in UTC: 2013-06-10T10:00Z</li><li>Combined date and time in localtime with the timezone offset: 2013-06-10T12:00+02:00</li><li>Combined date and time in localtime with the timezone offset: 2013-06-10T07:00-03:00</li></ul> The examples refer all to the same time.
     * (Required)
     * 
     * @param end
     *     The end
     */
    @JsonProperty("end")
    public void setEnd(String end) {
        this.end = end;
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
        return new HashCodeBuilder().append(name).append(url).append(type).append(start).append(end).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Radio_show) == false) {
            return false;
        }
        Radio_show rhs = ((Radio_show) other);
        return new EqualsBuilder().append(name, rhs.name).append(url, rhs.url).append(type, rhs.type).append(start, rhs.start).append(end, rhs.end).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum Type {

        MP_3("mp3"),
        OGG("ogg");
        private final String value;
        private static Map<String, Radio_show.Type> constants = new HashMap<String, Radio_show.Type>();

        static {
            for (Radio_show.Type c: values()) {
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
        public static Radio_show.Type fromValue(String value) {
            Radio_show.Type constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
