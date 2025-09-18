package com.xworkz.hospital.impl;

import com.xworkz.hospital.HospitalEquipment;

public class XRayMachineImpl implements HospitalEquipment {

    @Override
    public void on() {
        System.out.println("X-Ray Machine is ON. Ready to scan.");
    }

    @Override
    public void off() {
        System.out.println("X-Ray Machine is OFF. Scanning stopped.");
    }
}
