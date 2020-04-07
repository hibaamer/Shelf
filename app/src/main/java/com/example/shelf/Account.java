package com.example.shelf;

/**
 * 
 */
public class Account {

    /**
     * Default constructor
     */
    public Account() {
    }

    /**
     * 
     */
    protected String Username;

    /**
     * 
     */
    protected String Email;

    /**
     * 
     */
    protected String Password;

    /**
     *  String Name
     *  String Email
     *  String Password
     * @return
     */
    public Void Account( String Name,  String Email,  String Password) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Void Logout() {
        // TODO implement here
        return null;
    }

    /**
     *  String Name
     *  String Password
     * @return
     */
    public boolean Login( String Name,  String Password) {
        // TODO implement here
        return false;
    }

    /**
     *  String Password
     * @return
     */
    public boolean Confirm_Password( String Password) {
        // TODO implement here
        return false;
    }

    /**
     * String Email
     * @return
     */
    public String Retrieve_Password( String Email) {
        // TODO implement here
        return "";
    }

}