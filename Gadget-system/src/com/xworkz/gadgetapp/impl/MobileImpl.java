package com.xworkz.gadgetapp.impl;

import com.xworkz.gadgetapp.Gadget;

public class MobileImpl implements Gadget {

    @Override
    public void on() {
        System.out.println("Mobile is powered ON. Welcome screen displayed.");
    }

    @Override
    public void off() {
        System.out.println("Mobile is powered OFF. Goodbye!");
    }
}
