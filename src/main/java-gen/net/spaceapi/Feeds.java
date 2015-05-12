
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
 * Feeds where users can get updates of your space
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "blog",
    "wiki",
    "calendar",
    "flickr"
})
public class Feeds {

    /**
     * 
     * 
     */
    @JsonProperty("blog")
    private Blog blog;
    /**
     * 
     * 
     */
    @JsonProperty("wiki")
    private Wiki wiki;
    /**
     * 
     * 
     */
    @JsonProperty("calendar")
    private Calendar calendar;
    /**
     * 
     * 
     */
    @JsonProperty("flickr")
    private Flickr flickr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * 
     * @return
     *     The blog
     */
    @JsonProperty("blog")
    public Blog getBlog() {
        return blog;
    }

    /**
     * 
     * 
     * @param blog
     *     The blog
     */
    @JsonProperty("blog")
    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    /**
     * 
     * 
     * @return
     *     The wiki
     */
    @JsonProperty("wiki")
    public Wiki getWiki() {
        return wiki;
    }

    /**
     * 
     * 
     * @param wiki
     *     The wiki
     */
    @JsonProperty("wiki")
    public void setWiki(Wiki wiki) {
        this.wiki = wiki;
    }

    /**
     * 
     * 
     * @return
     *     The calendar
     */
    @JsonProperty("calendar")
    public Calendar getCalendar() {
        return calendar;
    }

    /**
     * 
     * 
     * @param calendar
     *     The calendar
     */
    @JsonProperty("calendar")
    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    /**
     * 
     * 
     * @return
     *     The flickr
     */
    @JsonProperty("flickr")
    public Flickr getFlickr() {
        return flickr;
    }

    /**
     * 
     * 
     * @param flickr
     *     The flickr
     */
    @JsonProperty("flickr")
    public void setFlickr(Flickr flickr) {
        this.flickr = flickr;
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
        return new HashCodeBuilder().append(blog).append(wiki).append(calendar).append(flickr).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Feeds) == false) {
            return false;
        }
        Feeds rhs = ((Feeds) other);
        return new EqualsBuilder().append(blog, rhs.blog).append(wiki, rhs.wiki).append(calendar, rhs.calendar).append(flickr, rhs.flickr).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
