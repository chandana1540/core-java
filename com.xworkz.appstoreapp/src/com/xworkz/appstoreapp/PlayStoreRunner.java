package com.xworkz.appstoreapp;

import com.xworkz.appstoreapp.Validator.AppValidator;
import com.xworkz.appstoreapp.user.User;

public class PlayStoreRunner {
    public static void main(String[] args) {
        User user = new User();
        user.setFirstName("chandana");
        user.setLastName("L");
        user.setDOB("23-4-2003");
        user.setGender("Female");
        user.setMail("chandu34@gmail.com");
        user.setPassword("2345");
        user.setQualification("BE");
        user.setAge(22);
        user.setLocation("muneshwar Layout");
        user.setPinCode("560058");
        user.setState("karnataka");
        user.setCountry("India");
        user.setAdharNumber("975883817140");
        user.setPhoneNumber(5634672390L);
        user.setCity("banglore");

        AppValidator appValidator = new AppValidator();
        boolean isUserVerfied = appValidator.userInfoValidated(user);
if (isUserVerfied){
    System.out.println("The first name is :"+user.getFirstName());
    System.out.println("lastName:"+user.getLastName());
    System.out.println("date of birth: "+user.getDOB());
    System.out.println("gender: "+user.getGender());
    System.out.println("mail: "+user.getMail());
    System.out.println("password"+user.getPassword());
    System.out.println("qualification"+user.getQualification());
    System.out.println("age:"+user.getAge());
    System.out.println("location: "+user.getLocation());
    System.out.println("pincode: "+user.getPinCode());
    System.out.println("state: "+user.getCountry());
    System.out.println("country:"+user.getCountry());
    System.out.println("adarNumber: "+user.getAdharNumber());
    System.out.println("phoneNumber: "+user.getPhoneNumber());
    System.out.println("city: "+user.getCity());


    System.out.println("the user is verified :"+isUserVerfied);
}else
{
    System.out.println("not valid");
}


        }

    }

