package com.xworkz.headlightapp.impl;

import com.xworkz.headlightapp.Switch;

public class LEDHeadlightImpl implements Switch {

    @Override
    public void on() {
        System.out.println("LED Headlight is switched ON. Bright, energy-efficient light enabled.");
    }

    @Override
    public void off() {
        System.out.println("LED Headlight is switched OFF.");
    }
}

