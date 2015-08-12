package de.fau.cs.mad.fablab.rest.core;


import com.fasterxml.jackson.annotation.JsonProperty;
import de.fau.cs.mad.fablab.rest.api.DeviceType;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="registrationid")
public class RegistrationId implements Serializable{

    public RegistrationId(){
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long registrationid_id;

    @Column(name = "registrationid", nullable = false)
    protected String registrationid;

    @Column(name = "devicetype", nullable = false)
    protected DeviceType deviceType = DeviceType.Unspecified;

    public RegistrationId(String aRegistrationId, DeviceType aDeviceType){
        registrationid = aRegistrationId;
        deviceType = aDeviceType;
    }

    @JsonProperty
    public void setRegistrationid_id(long aRegistrationid_id) {registrationid_id = aRegistrationid_id;}
    public long getRegistrationid_id() {return registrationid_id;}

    @JsonProperty
    public String getRegistrationid() {return registrationid;}
    public void setRegistrationid(String aRegistrationid) {registrationid = aRegistrationid;}

    @JsonProperty
    public DeviceType getDeviceType() {
        return deviceType;
    }
    public void setDeviceType(DeviceType devicetype) {
        this.deviceType = devicetype;
    }

    @Override
    public String toString() {
        return "RegistrationId{" + "registrationid_id=" + registrationid_id + ", registrationid=" + registrationid + '}';
    }
}
