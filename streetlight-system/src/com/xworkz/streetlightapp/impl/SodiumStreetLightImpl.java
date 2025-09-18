package com.xworkz.streetlightapp.impl;

import com.xworkz.streetlightapp.Switch;

public class SodiumStreetLightImpl implements Switch {

    @Override
    public void on() {
        System.out.println("Sodium Vapor Street Light is switched ON. Bright yellow light active.");
    }

    @Override
    public void off() {
        System.out.println("Sodium Vapor Street Light is switched OFF. Light extinguished.");
    }
}
