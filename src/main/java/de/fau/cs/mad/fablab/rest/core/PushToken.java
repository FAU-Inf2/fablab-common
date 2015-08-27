package de.fau.cs.mad.fablab.rest.core;


import de.fau.cs.mad.fablab.rest.api.PushType;

import java.io.Serializable;


public class PushToken implements Serializable{



    protected String token;

    protected PushType deviceType = PushType.UNSPECIFIED;

    public PushToken(){}

    public PushToken(String token, PushType deviceType){
        this.token = token;
        this.deviceType = deviceType;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public PushType getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(PushType deviceType) {
        this.deviceType = deviceType;
    }
}
