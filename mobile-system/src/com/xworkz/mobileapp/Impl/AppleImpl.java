package com.xworkz.mobileapp.Impl;

import com.xworkz.mobileapp.Switch;

public class AppleImpl implements Switch {
    @Override
    public void switchOn() {
        System.out.println("Switch on the mobile");
    }

    @Override
    public void switchOff() {
        System.out.println("Switch off the mobile");
    }
}
