package de.fau.cs.mad.fablab.rest.core;


import java.io.Serializable;
import javax.persistence.*;


/**
 * Created by EE on 12.05.15.
 */

@Entity(name = "cartEntry")

public class CartEntry extends Product implements Serializable{

    @Id
    private long productId;

    @Column(name = "amount")
    private double amount;

    @Column(name = "categoryString")
    private String categoryString;

    @Column(name = "price")
    private double price;

    @Column(name = "categoryId")
    private long categoryId;

    @Column(name = "name")
    private String name;


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
