package de.fau.cs.mad.fablab.rest.core;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;


/**
 * This class represents a product, which is available in the Fablab
 */

@Entity
@Table(name = "product")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column(name = "product_id")
    protected String productId;

    @Column(name = "name", nullable = false)
    protected String name;

    @Column(name = "description")
    protected String description;

    @Column(name = "unit")
    protected String unit;

    @Column(name = "category_id")
    protected long categoryId;

    @Column(name = "category_string")
    protected String categoryString;

    @Column(name = "price")
    protected double price;

    @Column(name = "available")
    protected int itemsAvailable;

    @Column(name = "location")
    protected String location;

    @Column(name = "location_id")
    protected long location_id;

    @Column(name = "location_object")
    protected Location locationObject;

    @Column(name = "category")
    protected Category mCategory;

    public Product() {
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

    public void setCategory(Category aCategory) {
        mCategory = aCategory;
    }

    @JsonProperty
    public Category getCategory() {
        return mCategory;
    }

    @JsonProperty
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
    @JsonProperty
    public String getProductId() {
        return productId;
    }
    public void setProductId(String id) {
        this.productId = id;
    }

    @JsonProperty
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }

    @JsonProperty
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @JsonProperty
    public int getItemsAvailable() {
        return itemsAvailable;
    }
    public void setItemsAvailable(int itemsAvailable) {
        this.itemsAvailable = itemsAvailable;
    }

    @JsonProperty
    public long getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(long id) {
        this.categoryId = id;
    }

    @JsonProperty
    public String getCategoryString() {
        return categoryString;
    }
    public void setCategoryString(String cat) {
        this.categoryString = cat;
    }

    @JsonProperty
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty
    public long getLocation_id(){return location_id;}
    public void setLocation_id(long aLocationId){location_id = aLocationId;}

    @JsonProperty
    public Location getLocationObject() {return locationObject;}
    public void setLocationObject(Location locationObject) {this.locationObject = locationObject;}

    public String toString() {
        return "Product : Name : " + this.getName() + " Price : " + this.getPrice() + " Category : " + this.categoryString + " Location : " + this.location;
    }
}
