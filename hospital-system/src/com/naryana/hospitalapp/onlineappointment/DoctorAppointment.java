package com.naryana.hospitalapp.onlineappointment;

public class DoctorAppointment {
    private String appointmentDate;
    private int noOfPatients;

    public void setAppointmentDate(String  appointmentDate){
        this.appointmentDate = appointmentDate;
    }
    public String getAppointmentDate(){
        return appointmentDate;
    }
    public void setNoOfPatients(int noofPatients){
        this.noOfPatients = noofPatients;
    }
    public int getNoOfPatients(){
        return noOfPatients;
    }


}
