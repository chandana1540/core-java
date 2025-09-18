package com.xworkz.printerapp.impl;

import com.xworkz.printerapp.Switch;

public class InkjetPrinterImpl implements Switch {

    @Override
    public void on() {
        System.out.println("Inkjet Printer is switched ON and ready to print.");
    }

    @Override
    public void off() {
        System.out.println("Inkjet Printer is switched OFF.");
    }
}
