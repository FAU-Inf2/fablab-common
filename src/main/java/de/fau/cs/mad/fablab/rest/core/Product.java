package de.fau.cs.mad.fablab.rest.core;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

/**
 * This class represents a product, which is available in the Fablab
 */

@Entity
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "vendor")
    private String vendor;

    @Column(name = "category_id")
    private long categoryId;

    @Column(name = "category_string")
    private String categoryString;

    @Column(name = "price")
    private double price;

    @Column(name = "available")
    private int itemsAvailable;

    public Product(){}
    public Product(long id, String name, double price, long categoryId, String categoryString){
        this.id = id;
        this.name = name;
        this.price = price;
        this.categoryId = categoryId;
        this.categoryString = categoryString;
    }

    @JsonProperty
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
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
    public long getCategoryId(){
        return categoryId;
    }
    public void setCategoryId(long id){this.categoryId = id; }

    @JsonProperty
    public String getCategoryString() {
        return categoryString;
    }
    public void setCategoryString(String cat){this.categoryString = cat;}

    public String toString() {
        return "Product : Name : " + this.getName() + " Price : " + this.getPrice()+ " Category : "+this.categoryString;
    }
}
