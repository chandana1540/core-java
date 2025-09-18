package com.xworkz.headlightapp.impl;

import com.xworkz.headlightapp.Switch;

public class HalogenHeadlightImpl implements Switch {

    @Override
    public void on() {
        System.out.println("Halogen Headlight is switched ON. Bright light enabled.");
    }

    @Override
    public void off() {
        System.out.println("Halogen Headlight is switched OFF.");
    }
}
