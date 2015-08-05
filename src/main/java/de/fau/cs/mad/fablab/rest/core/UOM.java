package de.fau.cs.mad.fablab.rest.core;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class UOM implements Serializable {

    private long uom_id;

    private String name;

    private double rounding;

    //private boolean active;

    private double factor;

    private String uomType;

    private double factor_inv;

    @JsonProperty
    public void setUom_id(long uom_id) {this.uom_id = uom_id;}
    public long getUom_id() {return uom_id;}

    @JsonProperty
    public void setName(String name) {this.name = name;}
    public String getName() {return name;}

    //@JsonProperty
    //public void setActive(boolean active) {this.active = active;}
    //public boolean isActive() {return active;}

    @JsonProperty
    public void setFactor(double factor) {this.factor = factor;}
    public double getFactor() {return factor;}

    @JsonProperty
    public void setFactor_inv(double factor_inv) {this.factor_inv = factor_inv;}
    public double getFactor_inv() {return factor_inv;}

    @JsonProperty
    public void setRounding(double rounding) {this.rounding = rounding;}
    public double getRounding() {return rounding;}

    @JsonProperty
    public void setUomType(String uomType) {this.uomType = uomType;}
    public String getUomType() {return uomType;}

    @Override
    public String toString() {
        return "UOM: " + "id: " + getUom_id() + " name: " + getName() + "type:" +" rounding: " + getRounding() + " factor: " + getFactor();
    }
}
