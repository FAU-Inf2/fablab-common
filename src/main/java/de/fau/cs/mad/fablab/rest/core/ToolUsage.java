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
    private ToolUsage successor;

    @Transient
    @JsonProperty
    private long successorId = -1;

    @ManyToOne
    @JsonIgnore
    private FabTool tool = null;

    @Transient
    @JsonProperty
    private long toolId = -1;

    @Column(name = "user")
    private String user;

    @Column(name = "duration")
    private long duration;

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public long getSuccessorId() {
        if (successor == null)
            return successorId;

        return successor.getId();
    }

    public void setSuccessorId(long successorId) {
        this.successorId = successorId;
    }

    public FabTool getTool() {
        return tool;
    }

    public long getToolId() {
        if (tool == null)
            return toolId;

        return tool.getId();
    }

    public void setToolId(long id) {
        toolId = id;
    }

    public void setTool(FabTool tool) {
        this.tool = tool;

        if (tool == null)
            this.toolId = -1;
        else
            this.toolId = tool.getId();
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
