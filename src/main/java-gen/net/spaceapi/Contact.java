
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
 * Contact information about your space. You must define at least one which is in the list of allowed values of the issue_report_channels field.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "phone",
    "sip",
    "keymasters",
    "irc",
    "twitter",
    "facebook",
    "google",
    "identica",
    "foursquare",
    "email",
    "ml",
    "jabber",
    "issue_mail"
})
public class Contact {

    /**
     * Phone number, including country code with a leading plus sign. Example: <samp>+1 800 555 4567</samp>
     * 
     */
    @JsonProperty("phone")
    private String phone;
    /**
     * URI for Voice-over-IP via SIP. Example: <samp>sip:yourspace@sip.example.org</samp>
     * 
     */
    @JsonProperty("sip")
    private String sip;
    /**
     * Persons who carry a key and are able to open the space upon request. One of the fields irc_nick, phone, email or twitter must be specified.
     * 
     */
    @JsonProperty("keymasters")
    private List<Keymaster> keymasters = new ArrayList<Keymaster>();
    /**
     * URL of the IRC channel, in the form <samp>irc://example.org/#channelname</samp>
     * 
     */
    @JsonProperty("irc")
    private String irc;
    /**
     * Twitter handle, with leading @
     * 
     */
    @JsonProperty("twitter")
    private String twitter;
    /**
     * Facebook account.
     * 
     */
    @JsonProperty("facebook")
    private String facebook;
    /**
     * Google services.
     * 
     */
    @JsonProperty("google")
    private Google google;
    /**
     * Identi.ca or StatusNet account, in the form <samp>yourspace@example.org</samp>
     * 
     */
    @JsonProperty("identica")
    private String identica;
    /**
     * Foursquare ID, in the form <samp>4d8a9114d85f3704eab301dc</samp>.
     * 
     */
    @JsonProperty("foursquare")
    private String foursquare;
    /**
     * E-mail address for contacting your space. If this is a mailing list consider to use the contact/ml field.
     * 
     */
    @JsonProperty("email")
    private String email;
    /**
     * The e-mail address of your mailing list. If you use Google Groups then the e-mail looks like <samp>your-group@googlegroups.com</samp>.
     * 
     */
    @JsonProperty("ml")
    private String ml;
    /**
     * A public Jabber/XMPP multi-user chatroom in the form <samp>chatroom@conference.example.net</samp>
     * 
     */
    @JsonProperty("jabber")
    private String jabber;
    /**
     * A seperate email address for issue reports (see the <em>issue_report_channels</em> field). This value can be Base64-encoded.
     * 
     */
    @JsonProperty("issue_mail")
    private String issue_mail;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Phone number, including country code with a leading plus sign. Example: <samp>+1 800 555 4567</samp>
     * 
     * @return
     *     The phone
     */
    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    /**
     * Phone number, including country code with a leading plus sign. Example: <samp>+1 800 555 4567</samp>
     * 
     * @param phone
     *     The phone
     */
    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * URI for Voice-over-IP via SIP. Example: <samp>sip:yourspace@sip.example.org</samp>
     * 
     * @return
     *     The sip
     */
    @JsonProperty("sip")
    public String getSip() {
        return sip;
    }

    /**
     * URI for Voice-over-IP via SIP. Example: <samp>sip:yourspace@sip.example.org</samp>
     * 
     * @param sip
     *     The sip
     */
    @JsonProperty("sip")
    public void setSip(String sip) {
        this.sip = sip;
    }

    /**
     * Persons who carry a key and are able to open the space upon request. One of the fields irc_nick, phone, email or twitter must be specified.
     * 
     * @return
     *     The keymasters
     */
    @JsonProperty("keymasters")
    public List<Keymaster> getKeymasters() {
        return keymasters;
    }

    /**
     * Persons who carry a key and are able to open the space upon request. One of the fields irc_nick, phone, email or twitter must be specified.
     * 
     * @param keymasters
     *     The keymasters
     */
    @JsonProperty("keymasters")
    public void setKeymasters(List<Keymaster> keymasters) {
        this.keymasters = keymasters;
    }

    /**
     * URL of the IRC channel, in the form <samp>irc://example.org/#channelname</samp>
     * 
     * @return
     *     The irc
     */
    @JsonProperty("irc")
    public String getIrc() {
        return irc;
    }

    /**
     * URL of the IRC channel, in the form <samp>irc://example.org/#channelname</samp>
     * 
     * @param irc
     *     The irc
     */
    @JsonProperty("irc")
    public void setIrc(String irc) {
        this.irc = irc;
    }

    /**
     * Twitter handle, with leading @
     * 
     * @return
     *     The twitter
     */
    @JsonProperty("twitter")
    public String getTwitter() {
        return twitter;
    }

    /**
     * Twitter handle, with leading @
     * 
     * @param twitter
     *     The twitter
     */
    @JsonProperty("twitter")
    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    /**
     * Facebook account.
     * 
     * @return
     *     The facebook
     */
    @JsonProperty("facebook")
    public String getFacebook() {
        return facebook;
    }

    /**
     * Facebook account.
     * 
     * @param facebook
     *     The facebook
     */
    @JsonProperty("facebook")
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    /**
     * Google services.
     * 
     * @return
     *     The google
     */
    @JsonProperty("google")
    public Google getGoogle() {
        return google;
    }

    /**
     * Google services.
     * 
     * @param google
     *     The google
     */
    @JsonProperty("google")
    public void setGoogle(Google google) {
        this.google = google;
    }

    /**
     * Identi.ca or StatusNet account, in the form <samp>yourspace@example.org</samp>
     * 
     * @return
     *     The identica
     */
    @JsonProperty("identica")
    public String getIdentica() {
        return identica;
    }

    /**
     * Identi.ca or StatusNet account, in the form <samp>yourspace@example.org</samp>
     * 
     * @param identica
     *     The identica
     */
    @JsonProperty("identica")
    public void setIdentica(String identica) {
        this.identica = identica;
    }

    /**
     * Foursquare ID, in the form <samp>4d8a9114d85f3704eab301dc</samp>.
     * 
     * @return
     *     The foursquare
     */
    @JsonProperty("foursquare")
    public String getFoursquare() {
        return foursquare;
    }

    /**
     * Foursquare ID, in the form <samp>4d8a9114d85f3704eab301dc</samp>.
     * 
     * @param foursquare
     *     The foursquare
     */
    @JsonProperty("foursquare")
    public void setFoursquare(String foursquare) {
        this.foursquare = foursquare;
    }

    /**
     * E-mail address for contacting your space. If this is a mailing list consider to use the contact/ml field.
     * 
     * @return
     *     The email
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * E-mail address for contacting your space. If this is a mailing list consider to use the contact/ml field.
     * 
     * @param email
     *     The email
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * The e-mail address of your mailing list. If you use Google Groups then the e-mail looks like <samp>your-group@googlegroups.com</samp>.
     * 
     * @return
     *     The ml
     */
    @JsonProperty("ml")
    public String getMl() {
        return ml;
    }

    /**
     * The e-mail address of your mailing list. If you use Google Groups then the e-mail looks like <samp>your-group@googlegroups.com</samp>.
     * 
     * @param ml
     *     The ml
     */
    @JsonProperty("ml")
    public void setMl(String ml) {
        this.ml = ml;
    }

    /**
     * A public Jabber/XMPP multi-user chatroom in the form <samp>chatroom@conference.example.net</samp>
     * 
     * @return
     *     The jabber
     */
    @JsonProperty("jabber")
    public String getJabber() {
        return jabber;
    }

    /**
     * A public Jabber/XMPP multi-user chatroom in the form <samp>chatroom@conference.example.net</samp>
     * 
     * @param jabber
     *     The jabber
     */
    @JsonProperty("jabber")
    public void setJabber(String jabber) {
        this.jabber = jabber;
    }

    /**
     * A seperate email address for issue reports (see the <em>issue_report_channels</em> field). This value can be Base64-encoded.
     * 
     * @return
     *     The issue_mail
     */
    @JsonProperty("issue_mail")
    public String getIssue_mail() {
        return issue_mail;
    }

    /**
     * A seperate email address for issue reports (see the <em>issue_report_channels</em> field). This value can be Base64-encoded.
     * 
     * @param issue_mail
     *     The issue_mail
     */
    @JsonProperty("issue_mail")
    public void setIssue_mail(String issue_mail) {
        this.issue_mail = issue_mail;
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
        return new HashCodeBuilder().append(phone).append(sip).append(keymasters).append(irc).append(twitter).append(facebook).append(google).append(identica).append(foursquare).append(email).append(ml).append(jabber).append(issue_mail).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Contact) == false) {
            return false;
        }
        Contact rhs = ((Contact) other);
        return new EqualsBuilder().append(phone, rhs.phone).append(sip, rhs.sip).append(keymasters, rhs.keymasters).append(irc, rhs.irc).append(twitter, rhs.twitter).append(facebook, rhs.facebook).append(google, rhs.google).append(identica, rhs.identica).append(foursquare, rhs.foursquare).append(email, rhs.email).append(ml, rhs.ml).append(jabber, rhs.jabber).append(issue_mail, rhs.issue_mail).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
