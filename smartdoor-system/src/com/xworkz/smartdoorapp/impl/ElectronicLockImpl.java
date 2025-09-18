package com.xworkz.smartdoorapp.impl;

import com.xworkz.smartdoorapp.Switch;

public class ElectronicLockImpl implements Switch {

    @Override
    public void on() {
        System.out.println("Electronic Lock is ENGAGED. Door is now LOCKED.");
    }

    @Override
    public void off() {
        System.out.println("Electronic Lock is DISENGAGED. Door is now UNLOCKED.");
    }
}
