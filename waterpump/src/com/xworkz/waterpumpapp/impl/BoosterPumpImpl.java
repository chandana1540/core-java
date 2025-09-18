package com.xworkz.waterpumpapp.impl;

import com.xworkz.waterpumpapp.Switch;

public class BoosterPumpImpl implements Switch {

    @Override
    public void on() {
        System.out.println("Booster Water Pump is switched ON.");
    }

    @Override
    public void off() {
        System.out.println("Booster Water Pump is switched OFF.");
    }
}