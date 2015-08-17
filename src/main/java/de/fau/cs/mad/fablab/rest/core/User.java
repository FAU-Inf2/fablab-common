package de.fau.cs.mad.fablab.rest.core;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 class to represent a user for loggin in
*/
@Entity
@Table(name="User")
public class User implements Serializable
{
    @Column(name = "name")
	private String username;
    @Column(name = "roles")
    private List<Roles> roles;

    public User()
    {
        username = "";
        roles = new ArrayList<Roles>();
    }

    public User (String name)
    {
        username = name;
        roles = new ArrayList<Roles>();
    }

    public User (String name, ArrayList roles)
    {
        username = name;
        this.roles = roles;
    }

    @JsonProperty
     public String getUsername() {
    return username;
}
    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty
    public List<Roles> getRoles() {
        return roles;
    }
    public void setRoles(List<Roles> roles) {
        this.roles = roles;
    }
	
}

