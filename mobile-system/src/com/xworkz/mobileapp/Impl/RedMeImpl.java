package com.xworkz.mobileapp.Impl;

import com.xworkz.mobileapp.Switch;

public class RedMeImpl implements Switch {
    @Override
    public void switchOn() {
        System.out.println("Switch on the mobile2");
    }

    @Override
    public void switchOff() {
        System.out.println("Switch off the mobile2");
    }
}
