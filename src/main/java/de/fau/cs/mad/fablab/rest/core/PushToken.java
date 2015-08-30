package de.fau.cs.mad.fablab.rest.core;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "push_token")
public class PushToken implements Serializable{


    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "database_id")
    private long databaseId;

    @Column(name = "token")
    private String token;

    @Column(name = "platform_type")
    private PlatformType platformType = PlatformType.UNSPECIFIED;


    //Hopefully nobody needs to add @JsonIgnore looks like Hibernate needs it too?!
    @Column(name = "trigger_push_type")
    private TriggerPushType triggerPushType;

    public PushToken(){}

    public PushToken(String token){
        this.token = token;
    }

    public long getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(long databaseId) {
        databaseId = databaseId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public PlatformType getPlatformType() {
        return platformType;
    }

    public void setPlatformType(PlatformType platformType) {
        this.platformType = platformType;
    }


    public TriggerPushType getTriggerPushType() {
        return triggerPushType;
    }

    public void setTriggerPushType(TriggerPushType triggerPushType) {
        this.triggerPushType = triggerPushType;
    }

    @Override
    public String toString() {
        return "PushToken{" +
                "DatabaseId=" + databaseId +
                ", token='" + token + '\'' +
                ", platformType=" + platformType +
                ", triggerPushType=" + triggerPushType +
                '}';
    }
}
