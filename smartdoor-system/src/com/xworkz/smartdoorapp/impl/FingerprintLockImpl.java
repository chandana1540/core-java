package com.xworkz.smartdoorapp.impl;

import com.xworkz.smartdoorapp.Switch;

public class FingerprintLockImpl implements Switch {

    @Override
    public void on() {
        System.out.println("Fingerprint Lock is ENGAGED. Access restricted.");
    }

    @Override
    public void off() {
        System.out.println("Fingerprint Lock is DISENGAGED. Access allowed.");
    }
}
