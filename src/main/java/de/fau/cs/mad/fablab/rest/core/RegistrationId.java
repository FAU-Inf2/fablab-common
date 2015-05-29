package de.fau.cs.mad.fablab.rest.core;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name="registrationid")
public class RegistrationId {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long registrationid_id;

    @Column(name = "registrationid", nullable = false)
    protected long registrationid;

    public RegistrationId(long aRegistrationId){
        registrationid = aRegistrationId;
    }

    @JsonProperty
    public void setRegistrationid_id(long aRegistrationid_id) {registrationid_id = aRegistrationid_id;}
    public long getRegistrationid_id() {return registrationid_id;}

    @JsonProperty
    public long getRegistrationid() {return registrationid;}
    public void setRegistrationid(long aRegistrationid) {registrationid = aRegistrationid;}
}
