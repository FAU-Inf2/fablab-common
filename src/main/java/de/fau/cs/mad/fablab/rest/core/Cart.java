package de.fau.cs.mad.fablab.rest.core;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "status")
    private CartStatusEnum status;

    @OneToMany(mappedBy = "cart")
    private List<CartEntry> products;

    @Column(name = "push_id")
    private String pushId;

    @Column(name = "paidTimestamp")
    private long paidTimestamp;

    public Cart(){
        status = CartStatusEnum.SHOPPING;
        products = new ArrayList<>();
        String pushId ="";
    }


    @JsonProperty
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
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
}

