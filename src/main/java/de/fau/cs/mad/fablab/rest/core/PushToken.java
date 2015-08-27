package de.fau.cs.mad.fablab.rest.core;


import de.fau.cs.mad.fablab.rest.api.PlatformType;

import java.io.Serializable;


public class PushToken implements Serializable{



    protected String token;

    protected PlatformType platformType = PlatformType.UNSPECIFIED;

    public PushToken(){}


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
}
