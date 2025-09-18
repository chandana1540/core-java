package com.xworkz.vehicleapp.impl;

import com.xworkz.vehicleapp.Vehicle;

public class BikeImpl implements Vehicle {

    @Override
    public void on() {
        System.out.println("Bike started. Vroom Vroom!");
    }

    @Override
    public void off() {
        System.out.println("Bike turned off. Stand applied.");
    }
}


