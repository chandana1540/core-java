package com.xworkz.trafficsignalapp.impl;

import com.xworkz.trafficsignalapp.Switch;

public class GreenSignalImpl implements Switch {

    @Override
    public void on() {
        System.out.println("Green Traffic Signal is ON. Vehicles can GO.");
    }

    @Override
    public void off() {
        System.out.println("Green Traffic Signal is OFF. Prepare to slow down.");
    }
}
