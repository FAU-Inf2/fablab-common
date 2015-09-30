package de.fau.cs.mad.fablab.rest.core;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name="inventory")
public class InventoryItem {

    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "userName")
    protected String userName;

    @Column(name = "UUID")
    protected String UUID;

    @Column(name = "productId")
    protected String productId;

    @Column(name = "productName")
    protected String productName;

    @Column(name = "amount")
    private double amount;

    @Column(name = "updated_at")
    private Date updated_at;

    public InventoryItem(){
        this.updated_at = new Date(System.currentTimeMillis());
    }

    public InventoryItem(String userName, String UUID, String productName, String productId, double amount){
        this.userName = userName;
        this.amount = amount;
        this.productId = productId;
        this.UUID = UUID;
        this.productName = productName;
        this.updated_at = Calendar.getInstance().getTime();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at() {
        this.updated_at = Calendar.getInstance().getTime();
    }
}
