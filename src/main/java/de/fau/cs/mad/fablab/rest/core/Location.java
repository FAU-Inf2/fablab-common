package de.fau.cs.mad.fablab.rest.core;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "location")
public class Location implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    @Column(name = "name")
    protected String name;

    @Column(name = "code")
    protected String code;

    public Location(){
    }

    @JsonProperty
    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }

    @JsonProperty
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @JsonProperty
    public void setCode(String code) {
        this.code = code;
    }
    public String getCode() {
        return code;
    }


}
