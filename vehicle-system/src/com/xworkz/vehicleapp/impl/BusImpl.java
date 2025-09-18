package com.xworkz.vehicleapp.impl;

import com.xworkz.vehicleapp.Vehicle;

public class BusImpl implements Vehicle {

    @Override
    public void on() {
        System.out.println("Bus engine on. Ready for passengers.");
    }

    @Override
    public void off() {
        System.out.println("Bus engine off. Parked at depot.");
    }
}


