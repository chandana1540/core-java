package com.xworkz.passportuserapp.user;

public class PassportUser {
    private String cpvLocation;
    public void setCpvLocation(String cpvLocation){
        this.cpvLocation = cpvLocation;
    }
    public String getCpvLocation(){
        return cpvLocation;
    }
    private String dcbrLocation;

    public void setDcbrLocation(String dcbrLocation) {
        this.dcbrLocation = dcbrLocation;
    }

    public String getDcbrLocation() {
        return dcbrLocation;
    }

    private String givenName;

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    private String surName;

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getSurName() {
        return surName;
    }

    private String dob;

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDob() {
        return dob;
    }

    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    private boolean emailSame;

    public void setEmailSame(boolean emailSame) {
        this.emailSame = emailSame;
    }
    public boolean getEmailSame(){
        return emailSame;
    }


}
