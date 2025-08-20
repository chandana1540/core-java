package com.xworkz.googleapp.google;

import com.xworkz.googleapp.user.GoogleUser;

public class Google {
    GoogleUser googleUser;

    public boolean createGoogleUser(GoogleUser googleUser) {
        boolean googleUserCreated = false;
        boolean firstNameValid = false;
        boolean surNameValid = false;
        boolean dobvalid = false;
        boolean emailValid = false;
        boolean phoneNumberValid = false;
        boolean passwordValid = false;
        boolean confirmpasswordValid = false;
        if (googleUser.getFirstName() != null) {
            firstNameValid = true;
        } else {
            System.out.println("firstname not found");
        }
        if (googleUser.getSurName() != null) {
            surNameValid = true;
        } else {
            System.out.println("surname is not valid");
        }
        if (googleUser.getDob() != null) {
            dobvalid = true;
        } else {
            System.out.println("DOB is not valid");
        }
        if (googleUser.getEmail() != null) {
            emailValid = true;
        } else {
            System.out.println("email is not valid");
        }
        if (googleUser.getPhoneNumber() != 0) {
            phoneNumberValid = true;
        } else {
            System.out.println("phone number is not valid");
        }
        if (googleUser.getPassword() != null) {
            passwordValid = true;
        } else {
            System.out.println("password is not valid");
        }
        if (googleUser.getPassword() == googleUser.getConfirmPassword()) {
            confirmpasswordValid = true;
        } else {
            System.out.println("confirm password is not valid");
        }
        if (firstNameValid && surNameValid && dobvalid && emailValid && phoneNumberValid && passwordValid && confirmpasswordValid) {
            googleUserCreated = true;
        }
        return googleUserCreated;
    }
        public void getDisplayInfo () {
            System.out.println("The firstName is: "+ googleUser.getFirstName());
            System.out.println("the surName is:"+ googleUser.getSurName());
            System.out.println("the dob is :"+ googleUser.getDob());
            System.out.println("the email is :"+ googleUser.getEmail());
            System.out.println("the phoneNumber is: "+ googleUser.getPhoneNumber());
            System.out.println("the password is: "+ googleUser.getPassword());
            System.out.println("the confirmpassword is: "+ googleUser.getConfirmPassword());




    }
}





