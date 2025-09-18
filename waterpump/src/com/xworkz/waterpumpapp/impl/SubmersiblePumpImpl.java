package com.xworkz.waterpumpapp.impl;

import com.xworkz.waterpumpapp.Switch;

public class SubmersiblePumpImpl implements Switch {

    @Override
    public void on() {
        System.out.println("Submersible Water Pump is switched ON.");
    }

    @Override
    public void off() {
        System.out.println("Submersible Water Pump is switched OFF.");
    }
}