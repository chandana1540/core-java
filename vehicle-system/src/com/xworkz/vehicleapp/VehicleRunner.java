package com.xworkz.vehicleapp;

import com.xworkz.vehicleapp.impl.BikeImpl;
import com.xworkz.vehicleapp.impl.BusImpl;
import com.xworkz.vehicleapp.impl.CarImpl;

public class VehicleRunner {
    public static void main(String[] args) {

        Vehicle car = new CarImpl();
        car.on();
        car.off();

        Vehicle bike = new BikeImpl();
        bike.on();
        bike.off();

        Vehicle bus = new BusImpl();
        bus.on();
        bus.off();
    }
}

