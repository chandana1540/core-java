package com.xworkz.geaserapp.Impl;

import com.xworkz.geaserapp.Switch;

public class InstantGeaser implements Switch {
    @Override
    public void on() {
        System.out.println("turn on the switch1");
    }

    @Override
    public void off() {
        System.out.println("turn off the switch1");
    }
}
