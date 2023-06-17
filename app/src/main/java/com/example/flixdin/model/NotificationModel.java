package com.example.flixdin.model;

public class NotificationModel {

    private int notifType;
    // 1 -> follow accept
    // 2 -> follow request
    // 3 -> connection call accept
    // 4 -> connection call request

    private String ownerID;
    // whom we have to show the notification

    private String senderID;
    // who created the event of notification

    private String notifMsg;

    public NotificationModel() {
    }

    public NotificationModel(int notifType, String ownerID,
                             String senderID, String notifMsg) {
        this.notifType = notifType;
        this.ownerID = ownerID;
        this.senderID = senderID;
        this.notifMsg = notifMsg;
    }

    public int getNotifType() {
        return notifType;
    }

    public void setNotifType(int notifType) {
        this.notifType = notifType;
    }

    public String getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
    }

    public String getSenderID() {
        return senderID;
    }

    public void setSenderID(String senderID) {
        this.senderID = senderID;
    }

    public String getNotifMsg() {
        return notifMsg;
    }

    public void setNotifMsg(String notifMsg) {
        this.notifMsg = notifMsg;
    }
}
