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

    @Column(name = "parent_category_id")
    protected long parent_category_id;

    @javax.persistence.Transient
    protected List<Long> child_categories;

    public Category(){
        child_categories = new ArrayList<>();
    }

    public Category(long aCategoryId, String aCategoryName,long location_id){
        categoryId = aCategoryId;
        name = aCategoryName;
        child_categories = new ArrayList<>();
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
    public void setParent_category_id(long parent_category_id) {this.parent_category_id = parent_category_id;}
    public long getParent_category_id() {return parent_category_id;}

    @JsonProperty
    public List<Long> getCategories() {
        return child_categories;}
    public void setCategories(List<Long> categories) {this.child_categories = categories;}

    @JsonProperty
    public long getLocation_id() {return location_id;}
    public void setLocation_id(long location_id) {this.location_id = location_id;}

    @JsonProperty
    public void addCategory(long aCategoryId){
        child_categories.add(aCategoryId);
    }

    @Override
    public String toString(){
        return "Category: " + "id: " + String.valueOf(getCategoryId()) + " -Name: "+ getName() + " -LocationId: " + getLocation_id();
    }
}
