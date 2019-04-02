package com.example.sociologiaapp.InfiniteViewPager;

public class Movie {
    private String name,description,bigdescription;
    private int image;

    public Movie() {
    }

    public Movie(String name, String description, int image, String bigdescription) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.bigdescription = bigdescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getBigdescription() {
        return bigdescription;
    }

    public void setBigdescription(String bigdescription) {
        this.bigdescription = bigdescription;
    }
}
