
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
 * A mapping of stream types to stream URLs.If you use other stream types make a <a href="add-your-space" target="_blank">change request</a> or prefix yours with <samp>ext_</samp> .
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "m4",
    "mjpeg",
    "ustream"
})
public class Stream {

    /**
     * Your mpg stream URL. Example: <samp>{"mp4": "http//example.org/stream.mpg"}</samp>
     * 
     */
    @JsonProperty("m4")
    private String m4;
    /**
     * Your mjpeg stream URL. Example: <samp>{"mjpeg": "http://example.org/stream.mjpeg"}</samp>
     * 
     */
    @JsonProperty("mjpeg")
    private String mjpeg;
    /**
     * Your ustream stream URL. Example: <samp>{"ustream": "http://www.ustream.tv/channel/hackspsps"}</samp>
     * 
     */
    @JsonProperty("ustream")
    private String ustream;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Your mpg stream URL. Example: <samp>{"mp4": "http//example.org/stream.mpg"}</samp>
     * 
     * @return
     *     The m4
     */
    @JsonProperty("m4")
    public String getM4() {
        return m4;
    }

    /**
     * Your mpg stream URL. Example: <samp>{"mp4": "http//example.org/stream.mpg"}</samp>
     * 
     * @param m4
     *     The m4
     */
    @JsonProperty("m4")
    public void setM4(String m4) {
        this.m4 = m4;
    }

    /**
     * Your mjpeg stream URL. Example: <samp>{"mjpeg": "http://example.org/stream.mjpeg"}</samp>
     * 
     * @return
     *     The mjpeg
     */
    @JsonProperty("mjpeg")
    public String getMjpeg() {
        return mjpeg;
    }

    /**
     * Your mjpeg stream URL. Example: <samp>{"mjpeg": "http://example.org/stream.mjpeg"}</samp>
     * 
     * @param mjpeg
     *     The mjpeg
     */
    @JsonProperty("mjpeg")
    public void setMjpeg(String mjpeg) {
        this.mjpeg = mjpeg;
    }

    /**
     * Your ustream stream URL. Example: <samp>{"ustream": "http://www.ustream.tv/channel/hackspsps"}</samp>
     * 
     * @return
     *     The ustream
     */
    @JsonProperty("ustream")
    public String getUstream() {
        return ustream;
    }

    /**
     * Your ustream stream URL. Example: <samp>{"ustream": "http://www.ustream.tv/channel/hackspsps"}</samp>
     * 
     * @param ustream
     *     The ustream
     */
    @JsonProperty("ustream")
    public void setUstream(String ustream) {
        this.ustream = ustream;
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
        return new HashCodeBuilder().append(m4).append(mjpeg).append(ustream).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Stream) == false) {
            return false;
        }
        Stream rhs = ((Stream) other);
        return new EqualsBuilder().append(m4, rhs.m4).append(mjpeg, rhs.mjpeg).append(ustream, rhs.ustream).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
