package com.naryana.hospitalapp;

import com.naryana.hospitalapp.onlineappointment.DoctorAppointment;

public class HospitalRunner {
    public static void main(String[] args) {
        DoctorAppointment appoint1 = new DoctorAppointment();
        //appoint1.appointmentDate = "24-05-2025";
        appoint1.setAppointmentDate("24-07-2025");
        appoint1.getAppointmentDate();
        appoint1.setNoOfPatients(3);
        appoint1.getNoOfPatients();
        System.out.println("appointmentDate: "+appoint1.getAppointmentDate());
        System.out.println("NoOfPatients: "+appoint1.getNoOfPatients());
    }
}
