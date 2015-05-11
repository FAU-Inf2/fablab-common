package de.fau.cs.mad.fablab.rest.entities;

/**
 * This class represents a product, which is available in the Fablab
 */
public class Product {

    private int id;

    private String name;
    private String description;
    private String vendor;

    private int price;
    private int itemsAvailable;

    public Product(int id, String name, int price, String vendor)
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.vendor = vendor;
    }

    public int getId() {
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

    public int getPrice() {
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
}
