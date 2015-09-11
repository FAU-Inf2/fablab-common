package de.fau.cs.mad.fablab.rest.core;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ProjectFile implements Serializable {

    @JsonProperty("description")
    private String description;

    @JsonProperty("filename")
    private String filename;

    @JsonProperty("content")
    private String content;

    public ProjectFile() {
    }

    public ProjectFile(String description, String filename, String content) {
        this.description = description;
        this.filename = filename;
        this.content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
