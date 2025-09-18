package com.xworkz.machineapp.Impl;

import com.xworkz.machineapp.Switch;

public class HairImpl implements Switch {
    @Override
    public void start() {
        System.out.println("press  the button to SwitchOn");
    }

    @Override
    public void stop() {
        System.out.println("press  the button to SwitchOff");
    }
}
