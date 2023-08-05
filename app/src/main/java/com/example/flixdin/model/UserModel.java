package com.example.flixdin.model;

import java.util.ArrayList;

public class UserModel {

    private String userID;
    private String emailID;
    private String phone;
    private String fullname;
    private String username;
    private String birthday;
    private String domain;
    private String skill;

    private String location;
    private String gender;
    private String bio;

    private ArrayList<UserModel> followers;

    private ArrayList<UserModel> following;


    public UserModel() {
    }

    public UserModel(String emailID, String fullname, String username) {
        this.emailID = emailID;
        this.fullname = fullname;
        this.username = username;
    }

    public UserModel(String userID, String emailID, String phone, String fullname, String username, String birthday, String domain, String skill, String location, String gender, String bio, ArrayList<UserModel> followers, ArrayList<UserModel> following) {
        this.userID = userID;
        this.emailID = emailID;
        this.phone = phone;
        this.fullname = fullname;
        this.username = username;
        this.birthday = birthday;
        this.domain = domain;
        this.skill = skill;
        this.location = location;
        this.gender = gender;
        this.bio = bio;
        this.followers = followers;
        this.following = following;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill= skill;
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

    public ArrayList<UserModel> getFollowers() {
        return followers;
    }

    public void setFollowers(ArrayList<UserModel> followers) {
        this.followers = followers;
    }

    public ArrayList<UserModel> getFollowing() {
        return following;
    }

    public void setFollowing(ArrayList<UserModel> following) {
        this.following = following;
    }
}
