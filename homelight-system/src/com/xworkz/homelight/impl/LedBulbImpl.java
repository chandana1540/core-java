package com.xworkz.homelight.impl;

import com.xworkz.homelight.Light;

public class LedBulbImpl implements Light {

    @Override
    public void on() {
        System.out.println("LED Bulb is ON. Energy saving mode active.");
    }

    @Override
    public void off() {
        System.out.println("LED Bulb is OFF. Power saved.");
    }
}

