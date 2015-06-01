package de.fau.cs.mad.fablab.rest.core;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a Cart included products
 */
@Entity
@Table(name="cart")
public class Cart implements Serializable {

    @Id
    @Column(name= "cart_code")
    private String cartCode;

    @Column(name = "status")
    private CartStatusEnum status;

    @OneToMany(mappedBy = "cart")
    private List<CartEntry> products;

    @Column(name = "push_id")
    private String pushId;

    @Column(name = "paidTimestamp")
    private long paidTimestamp;

    public Cart() {
        status = CartStatusEnum.SHOPPING;
        products = new ArrayList<>();
        pushId ="";
    }

    @JsonProperty
    public String getCartCode() {
        return cartCode;
    }
    public void setCartCode(String cart_code) {
        this.cartCode = cart_code;
    }

    @JsonProperty
    public CartStatusEnum getStatus() {
        return status;
    }
    public void setStatus(CartStatusEnum status) {
        this.status = status;
    }

    @JsonProperty
    public List<CartEntry> getProducts(){
        return products;
    }

    public void setProducts(List<CartEntry> products){
        this.products = products;
    }

    public List<CartEntry> addProduct(Product product, double count){
        for(CartEntry e : products){
            if(e.getProduct().getProductId() == product.getProductId()){
                e.setAmount(e.getAmount() + count);
                return products;
            }
        }
        products.add(new CartEntry(product, count));
        return products;
    }

    public List<CartEntry> removeProduct(Product product){
        for(CartEntry e : products){
            if(e.getProduct().getProductId() == product.getProductId()){
                products.remove(e);
            }
        }
        return products;
    }

    @JsonProperty
    public String getPushId() {
        return pushId;
    }

    public void setPushId(String pushId) {
        this.pushId = pushId;
    }

    @JsonProperty
    public long getPaidTimestamp() {
        return paidTimestamp;
    }

    public void setPaidTimestamp(long paidTimestamp) {
        this.paidTimestamp = paidTimestamp;
    }

    @JsonIgnore
    public double getTotal() {
        double total = 0;
        for (CartEntry e : products) {
            total += e.getTotal();
        }
        return total;
    }
}

