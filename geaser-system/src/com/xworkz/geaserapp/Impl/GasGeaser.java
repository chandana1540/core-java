package com.xworkz.geaserapp.Impl;

import com.xworkz.geaserapp.Switch;

public class GasGeaser implements Switch {
    @Override
    public void on() {
        System.out.println("turn on the switch");
    }

    @Override
    public void off() {
        System.out.println("turn off the switch");
    }
}
