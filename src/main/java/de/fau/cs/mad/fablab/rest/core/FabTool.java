package de.fau.cs.mad.fablab.rest.core;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FabTool")
public class FabTool {

    @Id
    private long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "link")
    private String link;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "details", columnDefinition = "TEXT")
    private String details;

    @Column(name = "linkToPicture")
    private String linkToPicture;

    @Column(name = "enabledForMachineUsage")
    private boolean enabledForMachineUsage = false;

    public FabTool() {
    }

    public FabTool(String title, String link, String description, String details, String linkToPicture) {
        this.title = title;
        this.link = link;
        this.description = description;
        this.details = details;
        this.linkToPicture = linkToPicture;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("details")
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @JsonProperty("linkToPicture")
    public String getLinkToPicture() {
        return linkToPicture;
    }

    public void setLinkToPicture(String linkToPicture) {
        this.linkToPicture = linkToPicture;
    }

    @JsonProperty("enabledForMachineUsage")
    public boolean getEnabledForMachineUsage() {
        return enabledForMachineUsage;
    }

    public void setEnabledForMachineUsage(boolean enabledForMachineUsage) {
        this.enabledForMachineUsage = enabledForMachineUsage;
    }
}
