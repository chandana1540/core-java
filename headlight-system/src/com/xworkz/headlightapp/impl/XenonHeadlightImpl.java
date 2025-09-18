package com.xworkz.headlightapp.impl;

import com.xworkz.headlightapp.Switch;

public class XenonHeadlightImpl implements Switch {

    @Override
    public void on() {
        System.out.println("Xenon Headlight is switched ON. Powerful illumination enabled.");
    }

    @Override
    public void off() {
        System.out.println("Xenon Headlight is switched OFF.");
    }
}

