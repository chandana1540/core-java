package com.xworkz.streetlightapp.impl;

import com.xworkz.streetlightapp.Switch;

public class LedStreetLightImpl implements Switch {

    @Override
    public void on() {
        System.out.println("LED Street Light is switched ON. Illuminating the street.");
    }

    @Override
    public void off() {
        System.out.println("LED Street Light is switched OFF. Darkness prevails.");
    }
}

