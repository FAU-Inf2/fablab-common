package de.fau.cs.mad.fablab.rest.core;


import de.fau.cs.mad.fablab.rest.api.PlatformType;

import java.io.Serializable;


public class PushToken implements Serializable{



    protected String token;

    protected PlatformType deviceType = PlatformType.UNSPECIFIED;

    public PushToken(){}

    public PushToken(String token, PlatformType deviceType){
        this.token = token;
        this.deviceType = deviceType;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public PlatformType getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(PlatformType deviceType) {
        this.deviceType = deviceType;
    }
}
