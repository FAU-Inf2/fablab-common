
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
 * Compound radiation sensor. Check this <a rel="nofollow" href="https://sites.google.com/site/diygeigercounter/gm-tubes-supported" target="_blank">resource</a>.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "alpha",
    "beta",
    "gamma",
    "beta_gamma"
})
public class Radiation {

    /**
     * An alpha sensor
     * 
     */
    @JsonProperty("alpha")
    private List<Alpha> alpha = new ArrayList<Alpha>();
    /**
     * A beta sensor
     * 
     */
    @JsonProperty("beta")
    private List<Betum> beta = new ArrayList<Betum>();
    /**
     * A gamma sensor
     * 
     */
    @JsonProperty("gamma")
    private List<Gamma> gamma = new ArrayList<Gamma>();
    /**
     * A sensor which cannot filter beta and gamma radiation seperately.
     * 
     */
    @JsonProperty("beta_gamma")
    private List<Beta_gamma> beta_gamma = new ArrayList<Beta_gamma>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * An alpha sensor
     * 
     * @return
     *     The alpha
     */
    @JsonProperty("alpha")
    public List<Alpha> getAlpha() {
        return alpha;
    }

    /**
     * An alpha sensor
     * 
     * @param alpha
     *     The alpha
     */
    @JsonProperty("alpha")
    public void setAlpha(List<Alpha> alpha) {
        this.alpha = alpha;
    }

    /**
     * A beta sensor
     * 
     * @return
     *     The beta
     */
    @JsonProperty("beta")
    public List<Betum> getBeta() {
        return beta;
    }

    /**
     * A beta sensor
     * 
     * @param beta
     *     The beta
     */
    @JsonProperty("beta")
    public void setBeta(List<Betum> beta) {
        this.beta = beta;
    }

    /**
     * A gamma sensor
     * 
     * @return
     *     The gamma
     */
    @JsonProperty("gamma")
    public List<Gamma> getGamma() {
        return gamma;
    }

    /**
     * A gamma sensor
     * 
     * @param gamma
     *     The gamma
     */
    @JsonProperty("gamma")
    public void setGamma(List<Gamma> gamma) {
        this.gamma = gamma;
    }

    /**
     * A sensor which cannot filter beta and gamma radiation seperately.
     * 
     * @return
     *     The beta_gamma
     */
    @JsonProperty("beta_gamma")
    public List<Beta_gamma> getBeta_gamma() {
        return beta_gamma;
    }

    /**
     * A sensor which cannot filter beta and gamma radiation seperately.
     * 
     * @param beta_gamma
     *     The beta_gamma
     */
    @JsonProperty("beta_gamma")
    public void setBeta_gamma(List<Beta_gamma> beta_gamma) {
        this.beta_gamma = beta_gamma;
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
        return new HashCodeBuilder().append(alpha).append(beta).append(gamma).append(beta_gamma).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Radiation) == false) {
            return false;
        }
        Radiation rhs = ((Radiation) other);
        return new EqualsBuilder().append(alpha, rhs.alpha).append(beta, rhs.beta).append(gamma, rhs.gamma).append(beta_gamma, rhs.beta_gamma).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
