package de.fau.cs.mad.fablab.rest.entities;

/**
 * This class represents a product, which is available in the Fablab
 */
public class Product {

    private long id;

    private String name;
    private String description;
    private String vendor;
    private long categoryId;
    private String categoryString;

    private double price;
    private int itemsAvailable;

    public Product(long id, String name, double price, long categoryId, String categoryString)
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.categoryId = categoryId;
        this.categoryString = categoryString;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getItemsAvailable() {
        return itemsAvailable;
    }

    public void setItemsAvailable(int itemsAvailable) {
        this.itemsAvailable = itemsAvailable;
    }

    public long getCategoryId(){
        return categoryId;
    }

    public String getCategoryString() {
        return categoryString;
    }

    public String toString() {
        return "Product : Name : " + this.getName() + " Price : " + this.getPrice()+ " Category : "+this.categoryString;
    }
}
