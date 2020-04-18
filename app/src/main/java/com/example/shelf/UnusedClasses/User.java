package com.example.shelf.UnusedClasses;


import com.example.shelf.Account;

public class User extends Account {

    public String Major;
    public String Level;
    public String Gender;
    public boolean Bookmark;
    public boolean Notification;

    public User() {
    }


    public void User( String Username,  String Email,  String Major,  String Level,  String Gender) {
        // TODO implement here
    }


    public void Register( String Name,  String Email,  String Password) {
        // TODO implement here
    }


    public boolean Update_Email( String Email) {
        // TODO implement here
        return false;
    }


    public boolean Update_Level( String Level) {
        // TODO implement here
        return false;
    }


    public void Clear_Bookmarks( boolean Bookmarks) {
        // TODO implement here
    }


    public void Clear_Notifications( boolean Notification) {
        // TODO implement here
    }

}