package com.xworkz.passportuserapp;

import com.xworkz.passportuserapp.passportseva.PassportSeva;
import com.xworkz.passportuserapp.user.PassportUser;

public class PassportSevaRunner {
    public static void main(String[] args) {
        PassportUser passportUser=new PassportUser();
        passportUser.setCpvLocation("po");
        passportUser.setDcbrLocation("Banglore");
        passportUser.setDob("20-05-2003");
        passportUser.setEmail("chandu34@gmail.com");
        passportUser.setEmailSame(true);
        passportUser.setGivenName("chaitanya");
        passportUser.setSurName("raj");

        PassportSeva PassportSeva = new PassportSeva();
        PassportSeva.createPassportUser(passportUser);
        System.out.println("cpvlocation: "+passportUser.getCpvLocation());
        System.out.println("dcbrlocation: "+passportUser.getDcbrLocation());
        System.out.println("dob: "+passportUser.getDcbrLocation());
        System.out.println("email: "+passportUser.getEmail());
        System.out.println("emailSame: "+passportUser.getEmailSame());
        System.out.println("givenName: "+passportUser.getGivenName());
        System.out.println("surName: "+passportUser.getSurName());
        }
    }

