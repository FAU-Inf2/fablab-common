package de.fau.cs.mad.fablab.rest.core;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by EE on 11.05.15.
 *

 EXAMPLE

 UID:calendar.484.field_datetime.4.1
 SUMMARY:StudentLab
 DTSTAMP:20150511T123540Z
 DTSTART:20140512T141500Z
 DTEND:20140512T154500Z
 RRULE:FREQ=WEEKLY;INTERVAL=1;UNTIL=20140707T215959Z;WKST=MO
 EXDATE:20140413T220000Z,20140414T220000Z,20140527T220000Z,20140529T220000Z,20140607T220000Z
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

    @Column(name = "dtstart", nullable = false)
    private String dtstart;

    @Column(name = "dtend", nullable = false)
    private String dtend;

    @Column(name = "rrule")
    private String rrule;


    @Column(name = "exdate")
    private String[] exdate;

    @Column(name = "url")
    private String url;

    @Column(name = "location")
    private String location;

    @Column(name = "description")
    private String description;

    @Transient
    private final SimpleDateFormat iCalDateToUtilDate=  new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'");

    public ICal(){}

    public ICal(String uid, String summery, String dtstamp, String dtstart, String dtend, String rrule, String[] exdate, String url, String location, String description){
        this.uid = uid;
        this.summery = summery;
        this.dtstamp = dtstamp;
        this.dtstart = dtstart;
        this.dtend = dtend;
        this.rrule = rrule;
        this.exdate = exdate;
        this.url = url;
        this.location = location;
        this.description = description;
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
    public String getDtstamp() {
        return dtstamp;
    }
    public void setDtstamp(String dtstamp) {
        this.dtstamp = dtstamp;
    }

    @JsonProperty
    public String getDtstart() {
        return dtstart;
    }
    public void setDtstart(String dtstart) {
        this.dtstart = dtstart;
    }

    @JsonProperty
    public String getDtend() {
        return dtend;
    }
    public void setDtend(String dtend) {
        this.dtend = dtend;
    }

    @JsonProperty
    public String getRrule() {  return rrule; }
    public void setRrule(String rrule) {this.rrule = rrule; }


    @JsonProperty
    public String[] getExdate() {
        return exdate;
    }
    public void setExdate(String[] exdate) {
        this.exdate = exdate;
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

    @Transient
    @JsonProperty
    public Date getDtstampAsDate(){
        try {
            return new Date(iCalDateToUtilDate.parse(this.dtstamp).getTime());
        }catch (ParseException e){
            e.printStackTrace();
        }
        return null;
    }

    @Transient
    @JsonProperty
    public Date getDtstartAsDate(){
        try {
            return new Date(iCalDateToUtilDate.parse(this.dtstart).getTime());
        }catch (ParseException e){
            e.printStackTrace();
        }
        return null;
    }

    @Transient
    @JsonProperty
    public Date getDtendAsDate(){
        try {
            return new Date(iCalDateToUtilDate.parse(this.dtend).getTime());
        }catch (ParseException e){
            e.printStackTrace();
        }
        return null;
    }

    @Transient
    @JsonProperty
    public Date[] getExDateAsDate(){
        Date[] date = new Date[this.exdate.length];
        for(int i = 0; i < this.exdate.length; i++){
            try {
                date[i] = new Date(iCalDateToUtilDate.parse(this.exdate[i]).getTime());
            }catch (ParseException e){
                e.printStackTrace();
            }
        }
        return date;
    }

}
