package de.fau.cs.mad.fablab.rest.core;

import java.io.Serializable;

/**
 * Created by EE on 12.05.15.
 */

/*
    OBJ OF THIS CLASS SHOULD JUST EXIST AS CART-ENTRIES! --> USE PRODUCT FOR OPEN-ERP PRODUCTS
 */

public class CartEntry implements Serializable {


    private long productId;
    private String name;
    private String description;
    private double count;

    public CartEntry(Product product, double count){
        this.productId = product.getId();
        this.name = product.getName();
        this.description = product.getDescription();
        this.count = count;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
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

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }
}
