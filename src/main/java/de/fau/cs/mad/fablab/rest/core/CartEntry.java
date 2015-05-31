package de.fau.cs.mad.fablab.rest.core;


import javax.persistence.*;
import java.io.Serializable;

/**
 * This class represents an entry in a shopping cart, specifying how many products are in a cart
 */

@Entity
@Table(name = "cartEntry")
public class CartEntry implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch=FetchType.LAZY)
    private Cart cart;

    @OneToOne
    private Product product;

    @Column(name = "amount")
    private double amount;

    // required no-arg constructor for ORM lite
    public CartEntry(){}

    public CartEntry(Product p, double amount){
        this.product = p;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
