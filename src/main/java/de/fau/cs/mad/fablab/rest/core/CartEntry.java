package de.fau.cs.mad.fablab.rest.core;

import java.io.Serializable;

/**
 * Created by EE on 12.05.15.
 */

/*
    OBJ OF THIS CLASS SHOULD JUST EXIST AS CART-ENTRIES! --> USE PRODUCT FOR OPEN-ERP PRODUCTS
 */

public class CartEntry implements Serializable {


    public long productId;
    public String name;
    public String description;
    public double count;

    public CartEntry(Product product, double count){
        this.productId = product.getId();
        this.name = product.getName();
        this.description = product.getDescription();
        this.count = count;
    }

}
