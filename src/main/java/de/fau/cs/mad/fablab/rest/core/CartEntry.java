package de.fau.cs.mad.fablab.rest.core;

import java.io.Serializable;

/**
 * Created by EE on 12.05.15.
 */


public class CartEntry extends Product implements Serializable{

    private double amount;

    public CartEntry(Product p, double amount){
        this.productId = p.getProductId();
        this.name = p.getName();
        this.price = p.getPrice();
        this.categoryId = p.getCategoryId();
        this.categoryString = p.getCategoryString();
        this.amount = amount;

    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
