package de.fau.cs.mad.fablab.rest.core;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "cartEntryServer")
public class CartEntryServer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dbId")
    private long id;

    @Column(name = "productId")
    protected String productId;

    @Column(name = "amount")
    private double amount;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="cartCode", nullable = false)
    private CartServer cart;

    public CartEntryServer() {}

    public CartEntryServer(String productId, CartServer cart, double amount) {
        this.productId = productId;
        this.cart = cart;
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public CartServer getCart() {
        return cart;
    }

    public void setCart(CartServer cart) {
        this.cart = cart;
    }
}
