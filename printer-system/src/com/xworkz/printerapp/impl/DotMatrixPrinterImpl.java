package com.xworkz.printerapp.impl;

import com.xworkz.printerapp.Switch;

public class DotMatrixPrinterImpl implements Switch {

    @Override
    public void on() {
        System.out.println("Dot Matrix Printer is switched ON and ready to print.");
    }

    @Override
    public void off() {
        System.out.println("Dot Matrix Printer is switched OFF.");
    }
}
