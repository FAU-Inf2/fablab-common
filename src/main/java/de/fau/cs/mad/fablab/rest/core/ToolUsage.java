package de.fau.cs.mad.fablab.rest.core;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

/**
 * Entity that represents use of a machine/tool
 */
@Entity
@Table(name="ToolUsage")
public class ToolUsage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JsonIgnore
    private ToolUsage successor = null;

    @Transient
    private long successorId = -1;

    @ManyToOne
    @JsonIgnore
    private FabTool tool = null;

    @Transient
    @JsonProperty
    private long toolId = -1;

    @Column(name = "user")
    private String user;

    @Column(name = "project")
    private String project;

    @JsonIgnore
    @Column(name = "token")
    private String token;

    @Column(name = "duration")
    private long duration;

    @Column(name = "startTime")
    private long startTime;

    @JsonProperty("startTime")
    public void setStartTime(long startTime) {this.startTime = startTime;}

    public long getStartTime() {return startTime;}

    @JsonProperty("duration")
    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @JsonProperty("successorid")
    public long getSuccessorId() {
        if (successor == null)
            return successorId;
        return successor.getId();
    }

    public void setSuccessorId(long successorId) {
        this.successorId = successorId;
    }

    @JsonProperty("toolId")
    public void setToolId(long id) {toolId = id;}

    public long getToolId() {
        if (tool == null)
            return toolId;

        return tool.getId();
    }

    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @JsonProperty("project")
    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public ToolUsage getSuccessor() {
        return successor;
    }

    public void setSuccessor(ToolUsage successor) {
        this.successor = successor;

        if (successor == null)
            this.successorId = -1;
        else
            this.successorId = successor.getId();
    }

    public FabTool getTool() {
        return tool;
    }

    public void setTool(FabTool tool) {
        this.tool = tool;

        if (tool == null)
            this.toolId = -1;
        else
            this.toolId = tool.getId();
    }

    @Override
    public String toString() {
        return "User: " + getUser() + " Project: " + getProject() + " CreationTime: " + getStartTime();
    }
}
