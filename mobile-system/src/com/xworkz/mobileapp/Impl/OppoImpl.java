package com.xworkz.mobileapp.Impl;

import com.xworkz.mobileapp.Switch;

public class OppoImpl implements Switch {
    @Override
    public void switchOn() {
        System.out.println("Switch on the mobile1");
    }

    @Override
    public void switchOff() {
        System.out.println("Switch off the mobile1");
    }
}
