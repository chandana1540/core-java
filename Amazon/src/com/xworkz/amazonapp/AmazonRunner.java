package com.xworkz.amazonapp;

import com.xworkz.amazonapp.Amazon.Amazon;
import com.xworkz.amazonapp.User.AmazonUser;

public class AmazonRunner {
    public static void main(String[] args) {
        AmazonUser amazonUser = new AmazonUser();
        amazonUser.setGivenName("chaitanya");
        amazonUser.setSurName("l");
        amazonUser.setEmail("chaithu@gmail.com");
        amazonUser.setPhoneNumber(4573160789L);
        amazonUser.setPassword("chaitu123");
        amazonUser.setcPwd("chaitu123");

        Amazon amazon=new Amazon();
        boolean userCreated=amazon.createUserRegistered(amazonUser);
        System.out.println("the user registered" +userCreated);

        if (userCreated){
            amazon.getInfo();

        }
    }
}