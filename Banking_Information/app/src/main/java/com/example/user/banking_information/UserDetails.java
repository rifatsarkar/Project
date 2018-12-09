package com.example.user.banking_information;

public class UserDetails {

    private String FirstName, LastName, Email, Phonenumber, Password, Date;

    public UserDetails() {
    }

    public UserDetails(String firstName, String lastName, String email, String phonenumber, String password, String date) {
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        Phonenumber = phonenumber;
        Password = password;
        Date = date;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhonenumber() {
        return Phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        Phonenumber = phonenumber;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
