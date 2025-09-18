package com.xworkz.vehicleapp.impl;

import com.xworkz.vehicleapp.Vehicle;

public class CarImpl implements Vehicle {

    @Override
    public void on() {
        System.out.println("Car engine started. Ready to drive.");
    }

    @Override
    public void off() {
        System.out.println("Car engine stopped. Keys removed.");
    }
}
