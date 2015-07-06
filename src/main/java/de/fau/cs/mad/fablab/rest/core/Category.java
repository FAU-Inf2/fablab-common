package de.fau.cs.mad.fablab.rest.core;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "category")
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "category_id")
    protected long categoryId;

    @Column(name = "category_name")
    protected String name;

    @Column(name = "location_id")
    protected long location_id;

    @Transient
    protected List<Long> categories;

    public Category(){
        categories = new ArrayList<>();
    }

    public Category(long aCategoryId, String aCategoryName,long location_id){
        categoryId = aCategoryId;
        name = aCategoryName;
        categories = new ArrayList<>();
    }

    @JsonProperty
    public long getId() {return id;}
    public void setId(long id) {this.id = id;}

    @JsonProperty
    public long getCategoryId() {return categoryId;}
    public void setCategoryId(long categoryId) {this.categoryId = categoryId;}

    @JsonProperty
    public String getName() {return name;}
    public void setName(String name) {
        this.name = name;}

    @JsonProperty
    public List<Long> getCategories() {
        return categories;}
    public void setCategories(List<Long> categories) {this.categories = categories;}

    @JsonProperty
    public long getLocation_id() {return location_id;}
    public void setLocation_id(long location_id) {this.location_id = location_id;}
}
