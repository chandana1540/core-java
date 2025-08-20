package com.xworkz.policestationapp;

import com.xworkz.policestationapp.police.Police;
import com.xworkz.policestationapp.policestation.PoliceStation;

public class PoliceStationRunner {
     public static void main(String[] args) {

     Police police = new Police();
     police.setNameOfStation("kumblugodu station");
     police.setStationId("kub12");
     police.setLocation("banglore");
     police.setNoOfConstables(21);

     PoliceStation policeStation = new PoliceStation();
     boolean created = policeStation.addPoliceInfo(police);
     if(created){
          System.out.println("The police info is Created"+created);
          
     }
}
