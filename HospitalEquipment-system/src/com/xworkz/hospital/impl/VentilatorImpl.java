package com.xworkz.hospital.impl;

import com.xworkz.hospital.HospitalEquipment;

public class VentilatorImpl implements HospitalEquipment {

    @Override
    public void on() {
        System.out.println("Ventilator is ON. Assisting patient breathing.");
    }

    @Override
    public void off() {
        System.out.println("Ventilator is OFF. Support stopped.");
    }
}