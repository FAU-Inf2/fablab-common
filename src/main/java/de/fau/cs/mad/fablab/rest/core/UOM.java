package de.fau.cs.mad.fablab.rest.core;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class UOM implements Serializable {

    private long mUomId;

    private String mName;

    private double mRounding;

    private String mUomType;

    @JsonProperty("uomId")
    public void setUom_id(long uom_id) {mUomId = uom_id;}
    public long getUom_id() {return mUomId;}

    @JsonProperty("name")
    public void setName(String name) {mName = name;}
    public String getName() {return mName;}

    @JsonProperty("rounding")
    public void setRounding(double rounding) {mRounding = rounding;}
    public double getRounding() {return mRounding;}

    @JsonProperty("uomType")
    public void setUomType(String uomType) {mUomType = uomType;}
    public String getUomType() {return mUomType;}

    @Override
    public String toString() {
        return "UOM: " + "id: " + getUom_id() + " name: " + getName() + "type:" +" rounding: " + getRounding();
    }
}
