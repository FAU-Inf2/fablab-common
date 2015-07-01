package de.fau.cs.mad.fablab.rest.core;

import java.io.Serializable;
import java.sql.SQLException;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * This class represents a Cart included products
 */
@Entity
@Table(name = "cart")
public class Cart implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @DatabaseField(canBeNull = false)
    private CartStatus status;

    @ForeignCollectionField
    private ForeignCollection<CartEntry> entries;

    public Cart() {
        status = CartStatus.SHOPPING;
    }

    public CartStatus getStatus() {
        return status;
    }

    public void setStatus(CartStatus status) {
        this.status = status;
    }

    public ForeignCollection<CartEntry> getEntries() {
        return entries;
    }

    public CartEntry addEntry(Product product, double amount) {
        CartEntry newEntry = new CartEntry(product, amount);
        entries.add(newEntry);
        return newEntry;
    }

    public void removeEntry(CartEntry entry) {
        entries.remove(entry);
    }

    public void updateEntry(CartEntry entry) {
        try {
            entries.update(entry);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public double getTotalPrice() {
        double total = 0.0;
        for (CartEntry e : entries) {
            total += e.getTotalPrice();
        }
        return total;
    }
}

