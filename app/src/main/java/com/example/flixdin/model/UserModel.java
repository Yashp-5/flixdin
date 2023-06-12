package com.example.flixdin.model;

import java.util.ArrayList;

public class UserModel {

    private String userID;
    private String emailID;
    private String fullname;
    private String username;
    private String birthday;
    private String domain;
    private ArrayList<String> preferences;
    private String location;
    private String gender;
    private String bio;


    public UserModel(String userID, String emailID, String fullname,
                     String username, String birthday, String domain,
                     ArrayList<String> preferences, String location,
                     String gender, String bio) {
        this.userID = userID;
        this.emailID = emailID;
        this.fullname = fullname;
        this.username = username;
        this.birthday = birthday;
        this.domain = domain;
        this.preferences = preferences;
        this.location = location;
        this.gender = gender;
        this.bio = bio;
    }

    public UserModel() {
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public ArrayList<String> getPreferences() {
        return preferences;
    }

    public void setPreferences(ArrayList<String> preferences) {
        this.preferences = preferences;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
