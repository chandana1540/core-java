package com.arjuna.hospitalapp.hospital;

import com.arjuna.hospitalapp.Validator.PatientValidator;
import com.arjuna.hospitalapp.patient.Patient;

public class Hospital {
    Patient patient;
    public boolean addPatient(Patient patient){
        boolean isPatientAdded = false;
        PatientValidator patientvalidator = new PatientValidator();
        boolean patientInfoValid = patientvalidator.patientInfo(patient);
            if(patientInfoValid){
                this.patient = patient;
                isPatientAdded = true;
            }
            return isPatientAdded;
        }
        public void getPatientInfo(){
            System.out.println("patientName is :"+patient.getPatientName());
            System.out.println("Gender is :"+patient.getGender());
            System.out.println("patient id is :"+patient.getPatientId());
            System.out.println("patient gender is:"+patient.getDateOfBirth());

        }


    }

