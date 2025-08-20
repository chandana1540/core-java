package com.arjuna.hospitalapp.patient;

public class Patient {
    String patientName;
    String gender;
    int patientId;
    String dateOfBirth;

    public void setPatientName(String patientName){
        this.patientName = patientName;
    }
    public String getPatientName(){
        return patientName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
}
