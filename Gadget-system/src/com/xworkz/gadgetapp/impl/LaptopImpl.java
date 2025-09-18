package com.xworkz.gadgetapp.impl;

import com.xworkz.gadgetapp.Gadget;

public class LaptopImpl implements Gadget {

    @Override
    public void on() {
        System.out.println("Laptop is booting up... Please wait.");
    }

    @Override
    public void off() {
        System.out.println("Laptop is shutting down. See you soon!");
    }
}

