package com.anhduc.curd_spring_angula.model;

public class Course {
    private int corseId;
    private String title;
    private String description;

    private String imageUrl;
    private String link;

    public Course() {
    }

    public Course(String title, String description, String imageUrl, String link) {
        this.title = title;
        this.description = description;
        this.imageUrl = imageUrl;
        this.link = link;
    }

    public int getCorseId() {
        return corseId;
    }

    public void setCorseId(int corseId) {
        this.corseId = corseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Course{" +
                "corseId=" + corseId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
