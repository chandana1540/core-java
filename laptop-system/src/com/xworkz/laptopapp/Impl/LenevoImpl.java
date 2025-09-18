package com.xworkz.laptopapp.Impl;

import com.xworkz.laptopapp.Switch;

public class LenevoImpl implements Switch {
    @Override
    public void on() {
        System.out.println("Turn on the laptop2");
    }

    @Override
    public void off() {
        System.out.println("Turn off the laptop2");
    }
}
