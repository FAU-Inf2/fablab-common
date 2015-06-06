package de.fau.cs.mad.fablab.rest.core;


import javax.persistence.*;
import java.io.Serializable;
import com.j256.ormlite.field.DatabaseField;

/**
 * This class represents an entry in a shopping cart, specifying how many products are in a cart
 */

@Entity
@Table(name = "cartEntry")
public class CartEntry implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //@ManyToOne(fetch=FetchType.LAZY)
    //private Cart cart;

    @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "cart_id")
    private Cart cart;

    //@ManyToOne
    @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "product_id", canBeNull = false)
    private Product product;

    @Column(name = "amount")
    private double amount;

    // required no-arg constructor for ORM lite
    public CartEntry(){}

    public CartEntry(Product p, double amount){
        this.product = p;
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
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


    public double getTotal() {
        return amount * product.getPrice();
    }

}
