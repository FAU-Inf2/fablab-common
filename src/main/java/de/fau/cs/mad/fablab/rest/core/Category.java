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

    @Column(name = "category_location")
    protected String location;

    @Column(name = "location_code")
    protected String location_code;

    @Column(name = "location_id")
    protected long location_id;

    protected List<Category> categories;

    public Category(){
        // Default
    }

    public Category(long aCategoryId, String aCategoryName, String aLocation){
        categoryId = aCategoryId;
        name = aCategoryName;
        location = aLocation;
        categories = new ArrayList<>();
    }

    @JsonProperty
    public long getId() {return id;}
    public void setId(long id) {this.id = id;}

    @JsonProperty
    public String getLocation() {return location;}
    public void setLocation(String location) {this.location = location;}

    @JsonProperty
    public long getCategoryId() {return categoryId;}
    public void setCategoryId(long categoryId) {this.categoryId = categoryId;}

    @JsonProperty
    public String getName() {return name;}
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty
    public List<Category> getCategories() {return categories;}
    public void setCategories(List<Category> categories) {this.categories = categories;}

    @JsonProperty
    public String getLocation_code() {return location_code;}
    public void setLocation_code(String location_code) {this.location_code = location_code;}

    @JsonProperty
    public long getLocation_id() {return location_id;}
    public void setLocation_id(long location_id) {this.location_id = location_id;}
}
