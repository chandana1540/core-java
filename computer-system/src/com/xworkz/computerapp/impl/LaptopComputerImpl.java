package com.xworkz.computerapp.impl;

import com.xworkz.computerapp.Switch;

public class LaptopComputerImpl implements Switch {

    @Override
    public void on() {
        System.out.println("Laptop Computer is switched ON.");
    }

    @Override
    public void off() {
        System.out.println("Laptop Computer is switched OFF.");
    }
}

