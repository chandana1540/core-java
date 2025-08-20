package com.xworkz.googleapp;

import com.xworkz.googleapp.google.Google;
import com.xworkz.googleapp.user.GoogleUser;

public class GoogleRunner {
    public static void main(String[] args) {

    GoogleUser googleUser = new GoogleUser();

        googleUser.setFirstName("chaitanya");
        googleUser.setSurName("raj");
        googleUser.setDob("23-04-2003");
        googleUser.setEmail("chaithanya34@gmail.com");
        googleUser.setPhoneNumber(5643256781L);
        googleUser.setPassword("234");
        googleUser.setConfirmPassword("234");

        Google google = new Google();
        boolean userCreated = google.createGoogleUser(googleUser);
        System.out.println("The user created" +userCreated);
        if(userCreated) {
            google.getDisplayInfo();

        }

    }
}
