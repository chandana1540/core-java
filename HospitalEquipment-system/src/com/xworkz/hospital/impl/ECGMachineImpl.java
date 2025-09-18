package com.xworkz.hospital.impl;

import com.xworkz.hospital.HospitalEquipment;

public class ECGMachineImpl implements HospitalEquipment {

    @Override
    public void on() {
        System.out.println("ECG Machine is ON. Monitoring heartbeat...");
    }

    @Override
    public void off() {
        System.out.println("ECG Machine is OFF. Monitoring stopped.");
    }
}
