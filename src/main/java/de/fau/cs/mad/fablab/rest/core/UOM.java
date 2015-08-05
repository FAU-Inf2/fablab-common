package de.fau.cs.mad.fablab.rest.core;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class UOM implements Serializable {

    private long uom_id;

    private String name;

    private double rounding;

    private String uomType;

    @JsonProperty
    public void setUom_id(long uom_id) {this.uom_id = uom_id;}
    public long getUom_id() {return uom_id;}

    @JsonProperty
    public void setName(String name) {this.name = name;}
    public String getName() {return name;}

    @JsonProperty
    public void setRounding(double rounding) {this.rounding = rounding;}
    public double getRounding() {return rounding;}

    @JsonProperty
    public void setUomType(String uomType) {this.uomType = uomType;}
    public String getUomType() {return uomType;}

    @Override
    public String toString() {
        return "UOM: " + "id: " + getUom_id() + " name: " + getName() + "type:" +" rounding: " + getRounding();
    }
}
