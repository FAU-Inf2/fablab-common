package de.fau.cs.mad.fablab.rest.core;


import java.io.Serializable;
import javax.persistence.*;

/**
 * Created by EE on 12.05.15.
 */

@Entity(name = "cart")
public class CartEntry extends Product implements Serializable{


    @Column(name = "amount")
    private double amount;

    // required no-arg constructor for ORM lite
    public CartEntry(){}

    public CartEntry(Product p, double amount){
        this.productId = p.getProductId();
        this.name = p.getName();
        this.price = p.getPrice();
        this.categoryId = p.getCategoryId();
        this.categoryString = p.getCategoryString();
	this.unit = p.getUnit();
        this.amount = amount;
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
