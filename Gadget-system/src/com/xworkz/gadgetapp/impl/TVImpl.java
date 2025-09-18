package com.xworkz.gadgetapp.impl;

import com.xworkz.gadgetapp.Gadget;

public class TVImpl implements Gadget {

    @Override
    public void on() {
        System.out.println("TV is switched ON. Showing your favorite channel.");
    }

    @Override
    public void off() {
        System.out.println("TV is switched OFF. Screen goes dark.");
    }
}
