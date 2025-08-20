package com.xworkz.policestationapp.policestation;

import com.xworkz.policestationapp.Validator.PoliceValidator;
import com.xworkz.policestationapp.police.Police;

public class PoliceStation {
    Police police;
    public boolean addPoliceInfo(Police police){
        boolean isAddedPoliceInfo = false;
        PoliceValidator policeValidator = new PoliceValidator();
        boolean bookInfoValid = policeValidator.policeValidated(police);
        if(bookInfoValid){
            this.police = police;
            isAddedPoliceInfo = true;

        }
        return isAddedPoliceInfo;
    }
    public void getBookInfo(){
        System.out.println("Name of the station : "+police.getNameOfStation());
        System.out.println("location: "+police.getLocation());
        System.out.println("stationId: "+police.getStationId());
        System.out.println(""+police.getNoOfConstables());
    }
}
