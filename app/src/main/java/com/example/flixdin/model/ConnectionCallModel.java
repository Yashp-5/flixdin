package com.example.flixdin.model;

public class ConnectionCallModel {

    private String connectionCallID;
    private String userID;
    private String username;
    private String domain;
    private String location;
    private String jobDesc;

    public ConnectionCallModel() {
    }

    public ConnectionCallModel(String connectionCallID, String userID,
                               String username, String domain, String location,
                               String jobDesc) {
        this.connectionCallID = connectionCallID;
        this.userID = userID;
        this.username = username;
        this.domain = domain;
        this.location = location;
        this.jobDesc = jobDesc;
    }

    public String getConnectionCallID() {
        return connectionCallID;
    }

    public void setConnectionCallID(String connectionCallID) {
        this.connectionCallID = connectionCallID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }
}
