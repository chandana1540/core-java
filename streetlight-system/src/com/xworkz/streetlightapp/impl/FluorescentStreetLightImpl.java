package com.xworkz.streetlightapp.impl;

import com.xworkz.streetlightapp.Switch;

public class FluorescentStreetLightImpl implements Switch {

    @Override
    public void on() {
        System.out.println("Fluorescent Street Light is switched ON. Street visibility improved.");
    }

    @Override
    public void off() {
        System.out.println("Fluorescent Street Light is switched OFF. Power saving mode activated.");
    }
}
