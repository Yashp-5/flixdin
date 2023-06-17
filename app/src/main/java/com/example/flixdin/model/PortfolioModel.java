package com.example.flixdin.model;

import java.net.URL;
import java.util.ArrayList;

public class PortfolioModel {

    private String userID;
    private String fullname;
    private ArrayList<URL> work;
    private String filmography;
    private ArrayList<URL> certificates;
    private String challenges;

    public PortfolioModel() {
    }

    public PortfolioModel(String userID, String fullname, ArrayList<URL> work, String filmography, ArrayList<URL> certificates, String challenges) {
        this.userID = userID;
        this.fullname = fullname;
        this.work = work;
        this.filmography = filmography;
        this.certificates = certificates;
        this.challenges = challenges;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public ArrayList<URL> getWork() {
        return work;
    }

    public void setWork(ArrayList<URL> work) {
        this.work = work;
    }

    public String getFilmography() {
        return filmography;
    }

    public void setFilmography(String filmography) {
        this.filmography = filmography;
    }

    public ArrayList<URL> getCertificates() {
        return certificates;
    }

    public void setCertificates(ArrayList<URL> certificates) {
        this.certificates = certificates;
    }

    public String getChallenges() {
        return challenges;
    }

    public void setChallenges(String challenges) {
        this.challenges = challenges;
    }
}
