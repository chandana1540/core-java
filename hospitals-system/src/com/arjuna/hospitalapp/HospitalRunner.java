package com.arjuna.hospitalapp;

import com.arjuna.hospitalapp.hospital.Hospital;
import com.arjuna.hospitalapp.patient.Patient;

public class HospitalRunner {
    public static void main(String[] args) {
        Patient patient = new Patient();
        patient.setPatientName("rajendra");
        patient.setGender("Male");
        patient.setPatientId(23);
        patient.setDateOfBirth("24-05-2001");

        Hospital hospital = new Hospital();
        boolean detailsCaptured = hospital.addPatient(patient);
        System.out.println("The patients details are:"+detailsCaptured);
        if(detailsCaptured){
            hospital.getPatientInfo();
        }
    }
}
