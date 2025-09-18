package com.xworkz.printerapp.impl;

import com.xworkz.printerapp.Switch;

public class LaserPrinterImpl implements Switch {

    @Override
    public void on() {
        System.out.println("Laser Printer is switched ON and ready to print.");
    }

    @Override
    public void off() {
        System.out.println("Laser Printer is switched OFF.");
    }
}
