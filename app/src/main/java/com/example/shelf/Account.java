package com.example.shelf;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Account {
    protected int ID;
    protected String Username;
    protected String Email;
    protected String Password;

    public Account() {
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getUsername() {
        return Username;
    }


    public void setEmail(String email) {
        Email = email;
    }

    public String getEmail() {
        return Email;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPassword() {
        return Password;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        return super.equals(obj);
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }

    public Void Account(String Name, String Email, String Password) {
        // TODO implement here
        return null;
    }


    public Void Logout() {
        // TODO implement here
        return null;
    }


    public boolean Login( String Name,  String Password) {
        // TODO implement here
        return false;
    }


    public boolean Confirm_Password( String Password) {
        // TODO implement here
        return false;
    }


    public String Retrieve_Password( String Email) {
        // TODO implement here
        return "";
    }

}