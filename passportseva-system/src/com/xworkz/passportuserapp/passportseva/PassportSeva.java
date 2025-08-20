package com.xworkz.passportuserapp.passportseva;

import com.xworkz.passportuserapp.user.PassportUser;

public class PassportSeva {
    PassportUser passportUser;
    public boolean createPassportUser(PassportUser passportUser) {
        boolean passportUserCreated = false;
        boolean cpvLocationValid = false;
        boolean dcbrLocationValid = false;
        boolean givenNameValid = false;
        boolean surNameValid = false;
        boolean DobValid = false;
        boolean emailValid = false;
        boolean emailSameValid = false;


        if (passportUser.getCpvLocation() != null) {
            cpvLocationValid = true;
        } else {
            System.out.println(" cpv location is not valid");
        }
        if (passportUser.getDcbrLocation() != null) {
            dcbrLocationValid = true;
        } else {
            System.out.println("Dcbr location is not Valid");
        }
        if (passportUser.getGivenName() != null) {
            givenNameValid = true;
        } else {
            System.out.println("givenname is not valid");
        }
        if (passportUser.getSurName() != null) {
            surNameValid = true;
        } else {
            System.out.println("surName is not Valid");
        }
        if (passportUser.getDob() != null) {
            DobValid = true;
        } else {
            System.out.println("dob is not valid");
        }
        if (passportUser.getEmail() != null) {
            emailValid = true;
        } else {
            System.out.println("email is not valid");
        }

        if (passportUser.getEmailSame()) {
            emailSameValid = true;
        } else {
            System.out.println("email same is not valid");
        }
        if(cpvLocationValid && dcbrLocationValid && givenNameValid && surNameValid && DobValid && emailValid && emailSameValid){
            passportUserCreated = true;
            this.passportUser=passportUser;
        }
        return passportUserCreated;
    }

}
