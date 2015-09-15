package de.fau.cs.mad.fablab.rest.core;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ProjectImageUpload implements Serializable {

    @JsonProperty("filename")
    private String filename;

    @JsonProperty("data")
    //private String data;
    private byte[] data;

    @JsonProperty("repoId")
    private String repoId;


    public ProjectImageUpload() {
    }

    public ProjectImageUpload(String filename, byte[] data, String repoId) {
        this.filename = filename;
        this.data = data;
        this.repoId = repoId;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public String getRepoId() {
        return repoId;
    }

    public void setRepoId(String repoId) {
        this.repoId = repoId;
    }
}
