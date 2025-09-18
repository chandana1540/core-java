package com.xworkz.acapp.impl;

import com.xworkz.acapp.Switch;

public class HairImpl implements Switch {
    @Override
    public void on() {
        System.out.println("AC is Turned On");
    }

    @Override
    public void off() {
        System.out.println("AC is Turned Off");
    }
}
