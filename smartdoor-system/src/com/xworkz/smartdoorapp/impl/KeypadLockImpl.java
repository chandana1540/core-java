package com.xworkz.smartdoorapp.impl;

import com.xworkz.smartdoorapp.Switch;

public class KeypadLockImpl implements Switch {

    @Override
    public void on() {
        System.out.println("Keypad Lock is ENGAGED. Door is securely LOCKED.");
    }

    @Override
    public void off() {
        System.out.println("Keypad Lock is DISENGAGED. Door is now UNLOCKED.");
    }
}

