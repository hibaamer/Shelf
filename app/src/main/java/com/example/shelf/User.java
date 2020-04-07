package com.example.shelf;

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
     *  String Username
     *  String Email
     *  String Major
     *  String Level
     *  String Gender
     * @return
     */
    public void User( String Username,  String Email,  String Major,  String Level,  String Gender) {
        // TODO implement here
    }

    /**
     *  String Name
     *  String Email
     *  String Password
     * @return
     */
    public void Register( String Name,  String Email,  String Password) {
        // TODO implement here
    }

    /**
     *  String Email
     * @return
     */
    public boolean Update_Email( String Email) {
        // TODO implement here
        return false;
    }

    /**
     *  String Level
     * @return
     */
    public boolean Update_Level( String Level) {
        // TODO implement here
        return false;
    }

    /**
     *  boolean Bookmarks
     * @return
     */
    public void Clear_Bookmarks( boolean Bookmarks) {
        // TODO implement here
    }

    /**
     *  boolen Notification
     * @return
     */
    public void Clear_Notifications( boolean Notification) {
        // TODO implement here
    }

}