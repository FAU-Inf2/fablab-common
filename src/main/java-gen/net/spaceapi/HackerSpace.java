
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


/**
 * SpaceAPI 0.13
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "api",
    "space",
    "logo",
    "url",
    "location",
    "spacefed",
    "cam",
    "stream",
    "state",
    "events",
    "contact",
    "issue_report_channels",
    "sensors",
    "feeds",
    "cache",
    "projects",
    "radio_show"
})
public class HackerSpace {

    /**
     * The version of SpaceAPI your endpoint uses
     * (Required)
     * 
     */
    @JsonProperty("api")
    private HackerSpace.Api api;
    /**
     * The name of your space
     * (Required)
     * 
     */
    @JsonProperty("space")
    private String space;
    /**
     * URL to your space logo
     * (Required)
     * 
     */
    @JsonProperty("logo")
    private String logo;
    /**
     * URL to your space website
     * (Required)
     * 
     */
    @JsonProperty("url")
    private String url;
    /**
     * Position data such as a postal address or geographic coordinates
     * (Required)
     * 
     */
    @JsonProperty("location")
    private Location location;
    /**
     * A flag indicating if the hackerspace uses SpaceFED, a federated login scheme so that visiting hackers can use the space WiFi with their home space credentials.
     * 
     */
    @JsonProperty("spacefed")
    private Spacefed spacefed;
    /**
     * URL(s) of webcams in your space
     * 
     */
    @JsonProperty("cam")
    private List<String> cam = new ArrayList<String>();
    /**
     * A mapping of stream types to stream URLs.If you use other stream types make a <a href="add-your-space" target="_blank">change request</a> or prefix yours with <samp>ext_</samp> .
     * 
     */
    @JsonProperty("stream")
    private Stream stream;
    /**
     * A collection of status-related data: actual open/closed status, icons, last change timestamp etc.
     * (Required)
     * 
     */
    @JsonProperty("state")
    private State state;
    /**
     * Events which happened recently in your space and which could be interesting to the public, like 'User X has entered/triggered/did something at timestamp Z'
     * 
     */
    @JsonProperty("events")
    private List<Event> events = new ArrayList<Event>();
    /**
     * Contact information about your space. You must define at least one which is in the list of allowed values of the issue_report_channels field.
     * (Required)
     * 
     */
    @JsonProperty("contact")
    private Contact contact;
    /**
     * This array defines all communication channels where you want to get automated issue reports about your SpaceAPI endpoint from the revalidator. This field is meant for internal usage only and it should never be consumed by any app. At least one channel must be defined. Please consider that when using <samp>ml</samp> the mailing list moderator has to moderate incoming emails or add the sender email to the subscribers. If you don't break your SpaceAPI implementation you won't get any notifications ;-)
     * (Required)
     * 
     */
    @JsonProperty("issue_report_channels")
    private List<Issue_report_channel> issue_report_channels = new ArrayList<Issue_report_channel>();
    /**
     * Data of various sensors in your space (e.g. temperature, humidity, amount of Club-Mate left, \u2026). The only canonical property is the <em>temp</em> property, additional sensor types may be defined by you. In this case, you are requested to share your definition for inclusion in this specification.
     * 
     */
    @JsonProperty("sensors")
    private Sensors sensors;
    /**
     * Feeds where users can get updates of your space
     * 
     */
    @JsonProperty("feeds")
    private Feeds feeds;
    /**
     * Specifies options about caching of your SpaceAPI endpoint. Use this if you want to avoid hundreds/thousands of application instances crawling your status.
     * 
     */
    @JsonProperty("cache")
    private Cache cache;
    /**
     * Your project sites (links to GitHub, wikis or wherever your projects are hosted)
     * 
     */
    @JsonProperty("projects")
    private List<String> projects = new ArrayList<String>();
    /**
     * A list of radio shows that your hackerspace might broadcast.
     * 
     */
    @JsonProperty("radio_show")
    private List<Radio_show> radio_show = new ArrayList<Radio_show>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The version of SpaceAPI your endpoint uses
     * (Required)
     * 
     * @return
     *     The api
     */
    @JsonProperty("api")
    public HackerSpace.Api getApi() {
        return api;
    }

    /**
     * The version of SpaceAPI your endpoint uses
     * (Required)
     * 
     * @param api
     *     The api
     */
    @JsonProperty("api")
    public void setApi(HackerSpace.Api api) {
        this.api = api;
    }

    /**
     * The name of your space
     * (Required)
     * 
     * @return
     *     The space
     */
    @JsonProperty("space")
    public String getSpace() {
        return space;
    }

    /**
     * The name of your space
     * (Required)
     * 
     * @param space
     *     The space
     */
    @JsonProperty("space")
    public void setSpace(String space) {
        this.space = space;
    }

    /**
     * URL to your space logo
     * (Required)
     * 
     * @return
     *     The logo
     */
    @JsonProperty("logo")
    public String getLogo() {
        return logo;
    }

    /**
     * URL to your space logo
     * (Required)
     * 
     * @param logo
     *     The logo
     */
    @JsonProperty("logo")
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * URL to your space website
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
     * URL to your space website
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
     * Position data such as a postal address or geographic coordinates
     * (Required)
     * 
     * @return
     *     The location
     */
    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    /**
     * Position data such as a postal address or geographic coordinates
     * (Required)
     * 
     * @param location
     *     The location
     */
    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * A flag indicating if the hackerspace uses SpaceFED, a federated login scheme so that visiting hackers can use the space WiFi with their home space credentials.
     * 
     * @return
     *     The spacefed
     */
    @JsonProperty("spacefed")
    public Spacefed getSpacefed() {
        return spacefed;
    }

    /**
     * A flag indicating if the hackerspace uses SpaceFED, a federated login scheme so that visiting hackers can use the space WiFi with their home space credentials.
     * 
     * @param spacefed
     *     The spacefed
     */
    @JsonProperty("spacefed")
    public void setSpacefed(Spacefed spacefed) {
        this.spacefed = spacefed;
    }

    /**
     * URL(s) of webcams in your space
     * 
     * @return
     *     The cam
     */
    @JsonProperty("cam")
    public List<String> getCam() {
        return cam;
    }

    /**
     * URL(s) of webcams in your space
     * 
     * @param cam
     *     The cam
     */
    @JsonProperty("cam")
    public void setCam(List<String> cam) {
        this.cam = cam;
    }

    /**
     * A mapping of stream types to stream URLs.If you use other stream types make a <a href="add-your-space" target="_blank">change request</a> or prefix yours with <samp>ext_</samp> .
     * 
     * @return
     *     The stream
     */
    @JsonProperty("stream")
    public Stream getStream() {
        return stream;
    }

    /**
     * A mapping of stream types to stream URLs.If you use other stream types make a <a href="add-your-space" target="_blank">change request</a> or prefix yours with <samp>ext_</samp> .
     * 
     * @param stream
     *     The stream
     */
    @JsonProperty("stream")
    public void setStream(Stream stream) {
        this.stream = stream;
    }

    /**
     * A collection of status-related data: actual open/closed status, icons, last change timestamp etc.
     * (Required)
     * 
     * @return
     *     The state
     */
    @JsonProperty("state")
    public State getState() {
        return state;
    }

    /**
     * A collection of status-related data: actual open/closed status, icons, last change timestamp etc.
     * (Required)
     * 
     * @param state
     *     The state
     */
    @JsonProperty("state")
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Events which happened recently in your space and which could be interesting to the public, like 'User X has entered/triggered/did something at timestamp Z'
     * 
     * @return
     *     The events
     */
    @JsonProperty("events")
    public List<Event> getEvents() {
        return events;
    }

    /**
     * Events which happened recently in your space and which could be interesting to the public, like 'User X has entered/triggered/did something at timestamp Z'
     * 
     * @param events
     *     The events
     */
    @JsonProperty("events")
    public void setEvents(List<Event> events) {
        this.events = events;
    }

    /**
     * Contact information about your space. You must define at least one which is in the list of allowed values of the issue_report_channels field.
     * (Required)
     * 
     * @return
     *     The contact
     */
    @JsonProperty("contact")
    public Contact getContact() {
        return contact;
    }

    /**
     * Contact information about your space. You must define at least one which is in the list of allowed values of the issue_report_channels field.
     * (Required)
     * 
     * @param contact
     *     The contact
     */
    @JsonProperty("contact")
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    /**
     * This array defines all communication channels where you want to get automated issue reports about your SpaceAPI endpoint from the revalidator. This field is meant for internal usage only and it should never be consumed by any app. At least one channel must be defined. Please consider that when using <samp>ml</samp> the mailing list moderator has to moderate incoming emails or add the sender email to the subscribers. If you don't break your SpaceAPI implementation you won't get any notifications ;-)
     * (Required)
     * 
     * @return
     *     The issue_report_channels
     */
    @JsonProperty("issue_report_channels")
    public List<Issue_report_channel> getIssue_report_channels() {
        return issue_report_channels;
    }

    /**
     * This array defines all communication channels where you want to get automated issue reports about your SpaceAPI endpoint from the revalidator. This field is meant for internal usage only and it should never be consumed by any app. At least one channel must be defined. Please consider that when using <samp>ml</samp> the mailing list moderator has to moderate incoming emails or add the sender email to the subscribers. If you don't break your SpaceAPI implementation you won't get any notifications ;-)
     * (Required)
     * 
     * @param issue_report_channels
     *     The issue_report_channels
     */
    @JsonProperty("issue_report_channels")
    public void setIssue_report_channels(List<Issue_report_channel> issue_report_channels) {
        this.issue_report_channels = issue_report_channels;
    }

    /**
     * Data of various sensors in your space (e.g. temperature, humidity, amount of Club-Mate left, \u2026). The only canonical property is the <em>temp</em> property, additional sensor types may be defined by you. In this case, you are requested to share your definition for inclusion in this specification.
     * 
     * @return
     *     The sensors
     */
    @JsonProperty("sensors")
    public Sensors getSensors() {
        return sensors;
    }

    /**
     * Data of various sensors in your space (e.g. temperature, humidity, amount of Club-Mate left, \u2026). The only canonical property is the <em>temp</em> property, additional sensor types may be defined by you. In this case, you are requested to share your definition for inclusion in this specification.
     * 
     * @param sensors
     *     The sensors
     */
    @JsonProperty("sensors")
    public void setSensors(Sensors sensors) {
        this.sensors = sensors;
    }

    /**
     * Feeds where users can get updates of your space
     * 
     * @return
     *     The feeds
     */
    @JsonProperty("feeds")
    public Feeds getFeeds() {
        return feeds;
    }

    /**
     * Feeds where users can get updates of your space
     * 
     * @param feeds
     *     The feeds
     */
    @JsonProperty("feeds")
    public void setFeeds(Feeds feeds) {
        this.feeds = feeds;
    }

    /**
     * Specifies options about caching of your SpaceAPI endpoint. Use this if you want to avoid hundreds/thousands of application instances crawling your status.
     * 
     * @return
     *     The cache
     */
    @JsonProperty("cache")
    public Cache getCache() {
        return cache;
    }

    /**
     * Specifies options about caching of your SpaceAPI endpoint. Use this if you want to avoid hundreds/thousands of application instances crawling your status.
     * 
     * @param cache
     *     The cache
     */
    @JsonProperty("cache")
    public void setCache(Cache cache) {
        this.cache = cache;
    }

    /**
     * Your project sites (links to GitHub, wikis or wherever your projects are hosted)
     * 
     * @return
     *     The projects
     */
    @JsonProperty("projects")
    public List<String> getProjects() {
        return projects;
    }

    /**
     * Your project sites (links to GitHub, wikis or wherever your projects are hosted)
     * 
     * @param projects
     *     The projects
     */
    @JsonProperty("projects")
    public void setProjects(List<String> projects) {
        this.projects = projects;
    }

    /**
     * A list of radio shows that your hackerspace might broadcast.
     * 
     * @return
     *     The radio_show
     */
    @JsonProperty("radio_show")
    public List<Radio_show> getRadio_show() {
        return radio_show;
    }

    /**
     * A list of radio shows that your hackerspace might broadcast.
     * 
     * @param radio_show
     *     The radio_show
     */
    @JsonProperty("radio_show")
    public void setRadio_show(List<Radio_show> radio_show) {
        this.radio_show = radio_show;
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
        return new HashCodeBuilder().append(api).append(space).append(logo).append(url).append(location).append(spacefed).append(cam).append(stream).append(state).append(events).append(contact).append(issue_report_channels).append(sensors).append(feeds).append(cache).append(projects).append(radio_show).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HackerSpace) == false) {
            return false;
        }
        HackerSpace rhs = ((HackerSpace) other);
        return new EqualsBuilder().append(api, rhs.api).append(space, rhs.space).append(logo, rhs.logo).append(url, rhs.url).append(location, rhs.location).append(spacefed, rhs.spacefed).append(cam, rhs.cam).append(stream, rhs.stream).append(state, rhs.state).append(events, rhs.events).append(contact, rhs.contact).append(issue_report_channels, rhs.issue_report_channels).append(sensors, rhs.sensors).append(feeds, rhs.feeds).append(cache, rhs.cache).append(projects, rhs.projects).append(radio_show, rhs.radio_show).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum Api {

        _0_13("0.13");
        private final String value;
        private static Map<String, HackerSpace.Api> constants = new HashMap<String, HackerSpace.Api>();

        static {
            for (HackerSpace.Api c: values()) {
                constants.put(c.value, c);
            }
        }

        private Api(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static HackerSpace.Api fromValue(String value) {
            HackerSpace.Api constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
