package de.fau.cs.mad.fablab.rest.core;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 Example:

 UID:calendar.484.field_datetime.4.1
 SUMMARY:StudentLab
 START:20140512T141500Z
 END:20140512T154500Z
 URL;VALUE=URI:https://fablab.fau.de/termine/2014-04-14-studentlab
 LOCATION:FabLab
 DESCRIPTION:Betreuer: Basti\, Julian\, Lukas

 */
@Entity
@Table(name="ical")
public class ICal implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "uid", nullable = false)
    private String uid;

    @Column(name = "summery", nullable = false)
    private String summery;

    @Column(name = "dtstamp", nullable = false)
    private String dtstamp;

    @Column(name = "start", nullable = false)
    private String start;

    @Column(name = "end", nullable = false)
    private String end;

    @Column(name = "url")
    private String url;

    @Column(name = "location")
    private String location;

    @Column(name = "description")
    private String description;

    @Column(name = "allday")
    private boolean allday;

    @Transient
    private final SimpleDateFormat iCalDateToUtilDate=  new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'");

    public ICal() {}

    public ICal(String uid, String summery, String dtstamp, String start, String end, String url, String location, String description, boolean allday) {
        this.uid = uid;
        this.summery = summery;
        this.dtstamp = dtstamp;
        this.start = start;
        this.end = end;
        this.url = url;
        this.location = location;
        this.description = description;
        this.allday = allday;
    }

    public ICal(String uid, String summery, String start, String end, String url, String location, String description, boolean allday) {
        this.uid = uid;
        this.summery = summery;
        this.start = start;
        this.end = end;
        this.url = url;
        this.location = location;
        this.description = description;
        this.allday = allday;
    }

    @JsonProperty
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @JsonProperty
    public String getUid() {
        return uid;
    }
    public void setUid(String uid) {
        this.uid = uid;
    }

    @JsonProperty
    public String getSummery() {
        return summery;
    }
    public void setSummery(String summery) {
        this.summery = summery;
    }

    @JsonProperty
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    @Transient
    @JsonProperty
    public Date getDtstartAsDate(){
        return getStartAsDate();
    }

    @Transient
    @JsonProperty
    public Date getStartAsDate(){
        try {
            return new Date(iCalDateToUtilDate.parse(this.start).getTime());
        }catch (ParseException e){
            e.printStackTrace();
        }
        return null;
    }

    @Transient
    @JsonProperty
    public Date getEndAsDate(){
        try {
            return new Date(iCalDateToUtilDate.parse(this.end).getTime());
        }catch (ParseException e){
            e.printStackTrace();
        }
        return null;
    }

    public boolean isAllday() {
        return allday;
    }

    public void setAllday(boolean allday) {
        this.allday = allday;
    }

    public String getDtstamp() {
        return dtstamp;
    }

    public void setDtstamp(String dtstamp) {
        this.dtstamp = dtstamp;
    }

    public SimpleDateFormat getiCalDateToUtilDate() {
        return iCalDateToUtilDate;
    }
}
