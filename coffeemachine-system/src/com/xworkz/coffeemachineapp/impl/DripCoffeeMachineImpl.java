package com.xworkz.coffeemachineapp.impl;

import com.xworkz.coffeemachineapp.Switch;

public class DripCoffeeMachineImpl implements Switch {

    @Override
    public void on() {
        System.out.println("Drip Coffee Machine is switched ON. Brewing drip coffee now.");
    }

    @Override
    public void off() {
        System.out.println("Drip Coffee Machine is switched OFF. Heating element deactivated.");
    }
}
