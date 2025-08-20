package com.xworkz.amazonapp.Amazon;


import com.xworkz.amazonapp.User.AmazonUser;

public class Amazon {
    AmazonUser amazonUser;

    public boolean createUserRegistered(AmazonUser amazonUser) {
        boolean givenNameValid = false;
        boolean surNameValid = false;
        boolean emailValid = false;
        boolean phoneNumberValid = false;
        boolean passwordValid = false;
        boolean confirmPasswordValid = false;
        boolean isRegistered = false;

        if (amazonUser.getGivenName() != null) {
            givenNameValid = true;
        } else {
            System.out.println("given name is not valid");
        }


        if (amazonUser.getSurName() != null) {
            surNameValid = true;
        } else {
            System.out.println("the sur name is not valid");
        }

        if (amazonUser.getEmail() != null) {
            emailValid = true;
        } else {
            System.out.println("the email is not valid ");
        }

        if (amazonUser.getPhoneNumber() != 0) {
            phoneNumberValid = true;
        } else {
            System.out.println("the phone number is not valid");
        }

        if (amazonUser.getPassword() != null) {
            passwordValid = true;
        } else {
            System.out.println("the password is not valid");
        }

        if (amazonUser.getcPwd() != null) {
            confirmPasswordValid = true;
        } else {
            System.out.println("the confirm password is not valid");
        }
        if (givenNameValid && surNameValid && emailValid && phoneNumberValid && passwordValid && confirmPasswordValid) {
            isRegistered = true;
            this.amazonUser=amazonUser;
        }
        return isRegistered;
    }


public  void getInfo(){
    System.out.println("the amazon user is:" + amazonUser.getGivenName());
    System.out.println("the sur name is:" + amazonUser.getSurName());
    System.out.println("the email is:" + amazonUser.getEmail());
    System.out.println("the phone number is:" + amazonUser.getPhoneNumber());
    System.out.println("the password is:" + amazonUser.getPassword());
    System.out.println("the confirm pwd is:" + amazonUser.getcPwd());
}

}