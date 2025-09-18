package com.xworkz.hospital;

import com.xworkz.hospital.impl.ECGMachineImpl;
import com.xworkz.hospital.impl.VentilatorImpl;
import com.xworkz.hospital.impl.XRayMachineImpl;

public class HospitalRunner {
    public static void main(String[] args) {

        HospitalEquipment xray = new XRayMachineImpl();
        xray.on();
        xray.off();

        HospitalEquipment ecg = new ECGMachineImpl();
        ecg.on();
        ecg.off();

        HospitalEquipment ventilator = new VentilatorImpl();
        ventilator.on();
        ventilator.off();
    }
}
