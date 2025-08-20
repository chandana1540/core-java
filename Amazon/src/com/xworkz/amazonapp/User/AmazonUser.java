package com.xworkz.amazonapp.User;

public class AmazonUser {
    private String givenName;
    public String getGivenName() {
        return givenName;
    }
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    private String surName;
    public String getSurName() {
        return surName;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }

    private String email;
    public String getEmail() {
        return  email;
    }

    public void setEmail(String email){
        this.email=email;
    }
    private long phoneNumber;
    public long getPhoneNumber(){
        return  phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    private String password;
    public String getPassword(){
        return  password;
    }
    public void setPassword(String password){
        this.password=password;
    }

    private String cPwd;
    public String getcPwd(){
        return  cPwd;
    }
    public void setcPwd(String cPwd){
        this.cPwd=cPwd;
    }

}