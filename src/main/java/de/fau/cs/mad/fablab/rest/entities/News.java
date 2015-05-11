package de.fau.cs.mad.fablab.rest.entities;

import java.util.Date;

/**
 * This class represents a news item.
 */
public class News {

    private int id;
    private String text;
    private Date date;
    private String headline;
    private String url;
    private String imageUrl;
    private String author;

    public News (String headline, String text, String author, String url, String imageUrl) {
        this.headline = headline;
        this.text = text;
        this.author = author;
        this.url = url;
        this.imageUrl = imageUrl;
        this.date = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
