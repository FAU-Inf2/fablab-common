package de.fau.cs.mad.fablab.rest.core;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
    @Column(name = "password")
    private String password;
    @Column(name = "roles")
    private List<Roles> roles;

    public User()
    {
        username = "";
        password = "";
        roles = new ArrayList();
    }

    public User (String name, String password)
    {
        username = name;
        this.password = password;
        roles = new ArrayList();
    }

    public User (String name, String password, ArrayList<Roles> roles)
    {
        username = name;
        this.password = password;
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

    @JsonProperty
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }

    public boolean hasRole(Roles role) {
        return roles.contains(role);
    }

    public void addRole(Roles role) {
        roles.add(role);
    }
	
}

