package de.fau.cs.mad.fablab.rest.core;

import javax.persistence.*;

@Entity
@Table(name = "cart_entry_server")
public class CartEntryServer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_entry_id")
    private long id;

    @Column(name = "product")
    protected String productId;

    @Column(name = "amount")
    private double amount;

    @ManyToOne
    @JoinColumn(name="cart_id")
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
