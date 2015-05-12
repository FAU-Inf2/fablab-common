
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
    "irc_nick",
    "phone",
    "email",
    "twitter"
})
public class Keymaster {

    /**
     * Real name
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * Contact the person with this nickname directly in irc if available. The irc channel to be used is defined in the contact/irc field.
     * 
     */
    @JsonProperty("irc_nick")
    private String irc_nick;
    /**
     * Example: <samp>['+1 800 555 4567','+1 800 555 4544']</samp>
     * 
     */
    @JsonProperty("phone")
    private String phone;
    /**
     * Email address which can be base64 encoded.
     * 
     */
    @JsonProperty("email")
    private String email;
    /**
     * Twitter username with leading <samp>@</samp>.
     * 
     */
    @JsonProperty("twitter")
    private String twitter;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Real name
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Real name
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Contact the person with this nickname directly in irc if available. The irc channel to be used is defined in the contact/irc field.
     * 
     * @return
     *     The irc_nick
     */
    @JsonProperty("irc_nick")
    public String getIrc_nick() {
        return irc_nick;
    }

    /**
     * Contact the person with this nickname directly in irc if available. The irc channel to be used is defined in the contact/irc field.
     * 
     * @param irc_nick
     *     The irc_nick
     */
    @JsonProperty("irc_nick")
    public void setIrc_nick(String irc_nick) {
        this.irc_nick = irc_nick;
    }

    /**
     * Example: <samp>['+1 800 555 4567','+1 800 555 4544']</samp>
     * 
     * @return
     *     The phone
     */
    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    /**
     * Example: <samp>['+1 800 555 4567','+1 800 555 4544']</samp>
     * 
     * @param phone
     *     The phone
     */
    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Email address which can be base64 encoded.
     * 
     * @return
     *     The email
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * Email address which can be base64 encoded.
     * 
     * @param email
     *     The email
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Twitter username with leading <samp>@</samp>.
     * 
     * @return
     *     The twitter
     */
    @JsonProperty("twitter")
    public String getTwitter() {
        return twitter;
    }

    /**
     * Twitter username with leading <samp>@</samp>.
     * 
     * @param twitter
     *     The twitter
     */
    @JsonProperty("twitter")
    public void setTwitter(String twitter) {
        this.twitter = twitter;
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
        return new HashCodeBuilder().append(name).append(irc_nick).append(phone).append(email).append(twitter).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Keymaster) == false) {
            return false;
        }
        Keymaster rhs = ((Keymaster) other);
        return new EqualsBuilder().append(name, rhs.name).append(irc_nick, rhs.irc_nick).append(phone, rhs.phone).append(email, rhs.email).append(twitter, rhs.twitter).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
