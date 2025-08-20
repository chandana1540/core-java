package com.xworkz.policestationapp.Validator;

import com.xworkz.policestationapp.police.Police;

public class PoliceValidator {

    public boolean policeValidated(Police police){
        boolean isPoliceValidated = false;
        boolean nameValid = false;
        boolean locationValid = false;
        boolean stationIdValid = false;
        boolean noOfConstablesValid = false;

        if(police.getNameOfStation()!=null && !police.getNameOfStation().isEmpty()){
            nameValid = true;
        }
        else{
            System.out.println("name is not valid");
        }
        if(police.getLocation()!=null && !police.getLocation().isEmpty()){
            locationValid = true;
        }
        else{
            System.out.println("location is not valid");
        }
        if(police.getStationId()!=null && !police.getStationId().isEmpty()){
            stationIdValid = true;
        }
        else{
            System.out.println("stationId is not valid");
        }
        if(police.getNoOfConstables()!=0){
            noOfConstablesValid = true;
        }
        else{
            System.out.println("noOfConstables is not valid");
        }
        if(nameValid && locationValid && stationIdValid && noOfConstablesValid){
            isPoliceValidated = true;
        }
        return isPoliceValidated ;
    }
}
