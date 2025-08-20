package com.xworkz.appstoreapp.Validator;

import com.xworkz.appstoreapp.user.User;

public class AppValidator {
    User user;
    public boolean userInfoValidated(User user){
        boolean isUserValidated = false;
        boolean firstNameValid = false;
        boolean lastNameValid = false;
        boolean DOBValid = false;
        boolean genderValid = false;
        boolean mailValid = false;
        boolean passwordValid = false;
        boolean qualificationValid = false;
        boolean ageValid = false;
        boolean locationValid = false;
        boolean pinCodeValid = false;
        boolean stateValid = false;
        boolean countryValid = false;
        boolean adharNumberValid = false;
        boolean phoneNumberValid = false;
        boolean  cityValid = false;
        if(user.getFirstName()!=null && !user.getFirstName().isEmpty()){
          firstNameValid = true;
        }
        else{
            System.out.println("The firstName is not valid");
        }
        if(user.getLastName()!=null && !user.getLastName().isEmpty()){
            lastNameValid = true;
        }
        else {
            System.out.println("The lastName is not Valid");
        }
        if(user.getDOB()!=null && !user.getDOB().isEmpty()){
            DOBValid = true;
        }
        else {
            System.out.println("The DOB is not valid");
        }
        if(user.getGender()!=null && !user.getGender().isEmpty()){
            genderValid = true;
        }
        else{
            System.out.println("the gender is not valid");
        }
        if(user.getMail()!=null && !user.getMail().isEmpty()){
            mailValid = true;
        }
        else{
            System.out.println("The mail is not valid");
        }
        if(user.getPassword()!=null && !user.getPassword().isEmpty()){
            passwordValid = true;
        }
        else{
            System.out.println("password is not valid");
        }
        if(user.getQualification()!=null && !user.getQualification().isEmpty()){
            qualificationValid = true;
        }
        else{
            System.out.println("qualification is not valid");
        }
        if(user.getAge()!=0){
            ageValid = true;
        }
        else{
            System.out.println("age is not valid");
        }
        if(user.getLocation()!=null && !user.getLocation().isEmpty()){
            locationValid = true;
        }
        else{
            System.out.println("location is not valid");
        }
        if(user.getPinCode()!=null && !user.getPinCode().isEmpty()){
            pinCodeValid = true;
        }
        else{
            System.out.println("pincode is not valid");
        }
        if(user.getState()!=null && !user.getState().isEmpty()){
            stateValid = true;
        }
        else{
            System.out.println("statevalid is not valid");
        }
        if(user.getCountry()!=null && !user.getCountry().isEmpty()){
            countryValid = true;
        }
        else{
            System.out.println("country is not valid");
        }
        if(user.getAdharNumber()!=null && !user.getAdharNumber().isEmpty()){
            adharNumberValid = true;
        }
        else{
            System.out.println("adhar no is not valid");
        }
        if(user.getPhoneNumber()!=0){
            phoneNumberValid = true;
        }
        else{
            System.out.println("PhoneNumber is not valid");
        }
        if(user.getCity()!=null && !user.getCity().isEmpty()){
            cityValid = true;
        }
        else{
            System.out.println("city is not valid");
        }
        if(firstNameValid && lastNameValid && DOBValid && genderValid && mailValid && passwordValid && qualificationValid &&  ageValid && locationValid && pinCodeValid && stateValid && countryValid && adharNumberValid && phoneNumberValid && cityValid){
            isUserValidated = true;
        }
        return isUserValidated;
    }
}
