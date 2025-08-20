package com.arjuna.hospitalapp.Validator;

import com.arjuna.hospitalapp.patient.Patient;

public class PatientValidator {

    public boolean patientInfo(Patient patient){
        boolean patientInfoValidated = false;
        boolean patientNameValid = false;
        boolean genderValid = false;
        boolean patientidValid = false;
        boolean dateofbirthValid = false;
        if(patient.getPatientName()!=null && !patient.getPatientName().isEmpty()){
            patientNameValid = true;
        }
        else{
            System.out.println("patientName is not valid");
        }
        if(patient.getGender()!=null && !patient.getGender().isEmpty()){
            genderValid = true;
        }
        else{
            System.out.println("gender is not valid");
        }
        if(patient.getPatientId()!=0 ){
            patientidValid = true;
        }
        else{
            System.out.println("patientId is not valid");
        }
        if(patient.getDateOfBirth()!=null && !patient.getDateOfBirth().isEmpty()){
            dateofbirthValid = true;
        }
        else{
            System.out.println("dateOfBirth is not valid");
        }
        if(patientNameValid && genderValid && patientidValid && dateofbirthValid){
            patientInfoValidated = true;
        }
        else{
            System.out.println("patientInfo is not validated");
        }
        return patientInfoValidated;
    }
}
