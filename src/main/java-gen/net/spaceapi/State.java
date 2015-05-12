
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
 * A collection of status-related data: actual open/closed status, icons, last change timestamp etc.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "open",
    "lastchange",
    "trigger_person",
    "message",
    "icon"
})
public class State {

    /**
     * A flag which indicates if the space is currently open or closed. The state 'undefined' can be achieved by assigning this field the value 'null' (without the quotes). In most (all?) programming languages this is evaluated to false so that no app should break
     * (Required)
     * 
     */
    @JsonProperty("open")
    private Boolean open;
    /**
     * The Unix timestamp when the space status changed most recently
     * 
     */
    @JsonProperty("lastchange")
    private Double lastchange;
    /**
     * The person who lastly changed the state e.g. opened or closed the space.
     * 
     */
    @JsonProperty("trigger_person")
    private String trigger_person;
    /**
     * An additional free-form string, could be something like <samp>'open for public'</samp>, <samp>'members only'</samp> or whatever you want it to be
     * 
     */
    @JsonProperty("message")
    private String message;
    /**
     * Icons that show the status graphically
     * 
     */
    @JsonProperty("icon")
    private Icon icon;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * A flag which indicates if the space is currently open or closed. The state 'undefined' can be achieved by assigning this field the value 'null' (without the quotes). In most (all?) programming languages this is evaluated to false so that no app should break
     * (Required)
     * 
     * @return
     *     The open
     */
    @JsonProperty("open")
    public Boolean getOpen() {
        return open;
    }

    /**
     * A flag which indicates if the space is currently open or closed. The state 'undefined' can be achieved by assigning this field the value 'null' (without the quotes). In most (all?) programming languages this is evaluated to false so that no app should break
     * (Required)
     * 
     * @param open
     *     The open
     */
    @JsonProperty("open")
    public void setOpen(Boolean open) {
        this.open = open;
    }

    /**
     * The Unix timestamp when the space status changed most recently
     * 
     * @return
     *     The lastchange
     */
    @JsonProperty("lastchange")
    public Double getLastchange() {
        return lastchange;
    }

    /**
     * The Unix timestamp when the space status changed most recently
     * 
     * @param lastchange
     *     The lastchange
     */
    @JsonProperty("lastchange")
    public void setLastchange(Double lastchange) {
        this.lastchange = lastchange;
    }

    /**
     * The person who lastly changed the state e.g. opened or closed the space.
     * 
     * @return
     *     The trigger_person
     */
    @JsonProperty("trigger_person")
    public String getTrigger_person() {
        return trigger_person;
    }

    /**
     * The person who lastly changed the state e.g. opened or closed the space.
     * 
     * @param trigger_person
     *     The trigger_person
     */
    @JsonProperty("trigger_person")
    public void setTrigger_person(String trigger_person) {
        this.trigger_person = trigger_person;
    }

    /**
     * An additional free-form string, could be something like <samp>'open for public'</samp>, <samp>'members only'</samp> or whatever you want it to be
     * 
     * @return
     *     The message
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * An additional free-form string, could be something like <samp>'open for public'</samp>, <samp>'members only'</samp> or whatever you want it to be
     * 
     * @param message
     *     The message
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Icons that show the status graphically
     * 
     * @return
     *     The icon
     */
    @JsonProperty("icon")
    public Icon getIcon() {
        return icon;
    }

    /**
     * Icons that show the status graphically
     * 
     * @param icon
     *     The icon
     */
    @JsonProperty("icon")
    public void setIcon(Icon icon) {
        this.icon = icon;
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
        return new HashCodeBuilder().append(open).append(lastchange).append(trigger_person).append(message).append(icon).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof State) == false) {
            return false;
        }
        State rhs = ((State) other);
        return new EqualsBuilder().append(open, rhs.open).append(lastchange, rhs.lastchange).append(trigger_person, rhs.trigger_person).append(message, rhs.message).append(icon, rhs.icon).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
