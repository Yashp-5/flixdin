package com.example.flixdin.model;

import java.util.ArrayList;

public class UserModel {

    private String userID;
    private String emailID;
    private String fullname;
    private String username;
    private String birthday;
    private String domain;
    private String location;
    private String gender;
    private String bio;

    private ArrayList<String> followers;
    private ArrayList<String> following;

    private ArrayList<String> posts;
    private ArrayList<String> saved_posts;
    private ArrayList<String> connectionCalls;
    private ArrayList<String> applied_connectionCalls;
    private ArrayList<String> saved_connectionCalls;


    public UserModel(String userID, String emailID, String fullname,
                     String username, String birthday, String domain,
                     String location, String gender, String bio) {
        this.userID = userID;
        this.emailID = emailID;
        this.fullname = fullname;
        this.username = username;
        this.birthday = birthday;
        this.domain = domain;
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

    // Create ConnectionCall
    public void createConnectionCall(String connectionCallID){
        connectionCalls.add(connectionCallID);
    }
}
