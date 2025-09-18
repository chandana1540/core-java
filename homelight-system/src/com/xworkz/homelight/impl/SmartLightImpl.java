package com.xworkz.homelight.impl;

import com.xworkz.homelight.Light;

public class SmartLightImpl implements Light {

    @Override
    public void on() {
        System.out.println("Smart Light is ON. Controlled via mobile app.");
    }

    @Override
    public void off() {
        System.out.println("Smart Light is OFF. Disconnected from app.");
    }
}
