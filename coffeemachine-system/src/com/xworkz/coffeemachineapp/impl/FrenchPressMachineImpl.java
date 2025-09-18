package com.xworkz.coffeemachineapp.impl;

import com.xworkz.coffeemachineapp.Switch;

public class FrenchPressMachineImpl implements Switch {

    @Override
    public void on() {
        System.out.println("French Press Machine is switched ON. Heating water for coffee.");
    }

    @Override
    public void off() {
        System.out.println("French Press Machine is switched OFF. Ready for manual coffee pressing.");
    }
}
