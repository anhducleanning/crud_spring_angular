package com.anhduc.curd_spring_angula.model;

public class Slider {
    private int id;
    private String image;
    private String thumbImage;
    private String title;

    public Slider() {
    }

    public Slider(String image, String thumbImage, String title) {
        this.image = image;
        this.thumbImage = thumbImage;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getThumbImage() {
        return thumbImage;
    }

    public void setThumbImage(String thumbImage) {
        this.thumbImage = thumbImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}