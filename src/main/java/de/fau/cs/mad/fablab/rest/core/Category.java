package de.fau.cs.mad.fablab.rest.core;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
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

    protected List<Category> categories;

    public Category(){
        // Default
    }

    public Category(long aCategoryId, String aCategoryName){
        categoryId = aCategoryId;
        name = aCategoryName;
    }

    public void setId(long id) {
        this.id = id;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    @JsonProperty
    public long getCategoryId() {
        return categoryId;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty
    public String getName() {
        return name;
    }

    @JsonProperty
    public List<Category> getCategories() {
        return categories;
    }

    public void addCategory(Category category){
        categories.add(category);
    }
}
