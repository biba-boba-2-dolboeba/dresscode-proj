package com.biba.boba.dresscode.model.post_model;


import java.util.ArrayList;

public class Post
{
    private int profileImage;
    private int backgroundImage;
    private int likes;
    private String profileName;
    private String description;
    private ArrayList<Integer> imageResourceId;

    Post(int profileImage, String profileName, String description, ArrayList<Integer> imageResourceId)
    {
        this.profileImage = profileImage;
        this.profileName = profileName;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public int getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(int profileImage) {
        this.profileImage = profileImage;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Integer> getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(ArrayList<Integer> imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}
