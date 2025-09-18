package com.xworkz.waterpumpapp.impl;

import com.xworkz.waterpumpapp.Switch;

public class CentrifugalPumpImpl implements Switch {

    @Override
    public void on() {
        System.out.println("Centrifugal Water Pump is switched ON.");
    }

    @Override
    public void off() {
        System.out.println("Centrifugal Water Pump is switched OFF.");
    }
}