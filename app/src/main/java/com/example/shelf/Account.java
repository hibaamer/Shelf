package com.example.shelf;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Account {
    public String username;
    public String email;
    public String password;

    public Account (String username , String email , String password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public Account() {

    }


    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
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