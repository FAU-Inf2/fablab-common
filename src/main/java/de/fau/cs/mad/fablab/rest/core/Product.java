package de.fau.cs.mad.fablab.rest.core;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;

import javax.persistence.*;
import java.io.Serializable;


/**
 * This class represents a product, which is available in the Fablab
 */

@Entity
@Table(name = "product")
public class Product implements Serializable {

    @Id
    @Column(name="database_id")
    @JsonIgnore
    private Long databaseId;

    @Column(name="id")
    private Integer id;

    @Column(name = "product_id")
    protected String productId;

    @Column(name = "name", nullable = false)
    protected String name;

    @Column(name = "description")
    protected String description;

    @Column(name = "unit")
    protected String unit;

    @Column(name = "oum_id")
    protected long oum_id;

    @Column(name = "category_id")
    protected long categoryId;

    @Column(name = "category_string")
    protected String categoryString;

    @Column(name = "price")
    protected double price;

    @Column(name = "available")
    protected int itemsAvailable;

    @Column(name = "saleable")
    protected boolean saleable;

    @Column(name = "location")
    protected String location;

    @Column(name = "locationForProductMap")
    protected String locationForProductMap;

    @Column(name = "location_id")
    protected long location_id;

    @Column(name = "category", columnDefinition = "binary(4096)")
    @DatabaseField(dataType = DataType.SERIALIZABLE)
    protected Category mCategory;

    @Column(name = "UOM")
    @DatabaseField(dataType  = DataType.SERIALIZABLE)
    protected UOM mUom;

    public Product() {
        mCategory = new Category();
        mUom = new UOM();
    }

    public Product(String productId, String name, double price, long categoryId, String categoryString, String unit, String location) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.categoryId = categoryId;
        this.categoryString = categoryString;
        this.unit = unit;
        this.location = location;
        mCategory = new Category();
    }

    public Long getDatabaseId(){ return databaseId;}
    public void setDatabaseId(Long databaseId){ this.databaseId = databaseId; }

    @JsonProperty("category")
    public Category getCategory() {return mCategory;}
    public void setCategory(Category aCategory) {mCategory = aCategory;}

    @JsonProperty("productId")
    public String getProductId() {return productId;}
    public void setProductId(String id) {
        this.productId = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("saleable")
    public void setSaleable(boolean saleable) {this.saleable = saleable;}
    public boolean getSaleable() {return saleable;}
    public boolean isSaleable(){return saleable;}

    @JsonProperty("unit")
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }

    @JsonProperty("price")
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @JsonProperty("categoryString")
    public String getCategoryString() {return categoryString;}
    public void setCategoryString(String cat) {this.categoryString = cat;}

    @JsonProperty("location")
    public String getLocation() {return location;}
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty("uom")
    public void setUom(UOM mUom) {this.mUom = mUom;}
    public UOM getUom() {return mUom;}

    @JsonProperty("locationForProductMap")
    public String getLocationForProductMap(){return this.locationForProductMap;}
    public void setLocationForProductMap(String aLocationForProductMap){this.locationForProductMap = aLocationForProductMap;}

    @JsonIgnore
    public long getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(long id) {
        this.categoryId = id;
    }

    @JsonIgnore
    public long getLocation_id(){return location_id;}
    public void setLocation_id(long aLocationId){location_id = aLocationId;}

    @JsonIgnore
    public void setOum_id(long oum_id) {this.oum_id = oum_id;}
    public long getOum_id() {return oum_id;}


    @Override
    public String toString() {
        return "Product : "+ "id : " + this.productId + "  -Name : " + getName() + " -Price : " + getPrice() + " -Unit : " + this.unit + " -Category : " + this.categoryString + " -Location : " + this.location;
    }

    @Override
    public boolean equals(Object other) {
        return this == other || (other != null && getClass() == other.getClass()
                && productId.equals(((Product) other).getProductId()));
    }
}
