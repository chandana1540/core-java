package com.xworkz.coffeemachineapp.impl;

import com.xworkz.coffeemachineapp.Switch;

public class EspressoMachineImpl implements Switch {

    @Override
    public void on() {
        System.out.println("Espresso Machine is switched ON. Brewing espresso now.");
    }

    @Override
    public void off() {
        System.out.println("Espresso Machine is switched OFF. Cleaning process started.");
    }
}
