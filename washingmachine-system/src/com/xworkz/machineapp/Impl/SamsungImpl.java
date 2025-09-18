package com.xworkz.machineapp.Impl;

import com.xworkz.machineapp.Switch;

public class SamsungImpl implements Switch {
    @Override
    public void start() {
        System.out.println("press  the button1 to SwitchOn");
    }

    @Override
    public void stop() {
        System.out.println("press  the button1 to SwitchOff");
    }
}
