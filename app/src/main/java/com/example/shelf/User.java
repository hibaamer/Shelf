package com.example.shelf;

import java.util.*;

/**
 * 
 */
public class User extends Account {

    /**
     * Default constructor
     */
    public User() {
    }

    /**
     * 
     */
    public String Major;

    /**
     * 
     */
    public String Level;

    /**
     * 
     */
    public String Gender;

    /**
     * 
     */
    public boolean Bookmark;

    /**
     * 
     */
    public boolean Notification;

    /**
     * @param String Username 
     * @param String Email 
     * @param String Major 
     * @param String Level 
     * @param String Gender 
     * @return
     */
    public void User( String Username,  String Email,  String Major,  String Level,  String Gender) {
        // TODO implement here
    }

    /**
     * @param String Name 
     * @param String Email 
     * @param String Password 
     * @return
     */
    public void Register( String Name,  String Email,  String Password) {
        // TODO implement here
    }

    /**
     * @param String Email 
     * @return
     */
    public boolean Update_Email( String Email) {
        // TODO implement here
        return false;
    }

    /**
     * @param String Level 
     * @return
     */
    public boolean Update_Level( String Level) {
        // TODO implement here
        return false;
    }

    /**
     * @param boolean Bookmarks 
     * @return
     */
    public void Clear_Bookmarks( boolean Bookmarks) {
        // TODO implement here
    }

    /**
     * @param boolen Notification 
     * @return
     */
    public void Clear_Notifications( boolean Notification) {
        // TODO implement here
    }

}