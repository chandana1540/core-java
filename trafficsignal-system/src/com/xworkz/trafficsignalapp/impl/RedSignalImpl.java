package com.xworkz.trafficsignalapp.impl;

import com.xworkz.trafficsignalapp.Switch;

public class RedSignalImpl implements Switch {

    @Override
    public void on() {
        System.out.println("Red Traffic Signal is ON. Vehicles must STOP.");
    }

    @Override
    public void off() {
        System.out.println("Red Traffic Signal is OFF. Vehicles may proceed.");
    }
}
