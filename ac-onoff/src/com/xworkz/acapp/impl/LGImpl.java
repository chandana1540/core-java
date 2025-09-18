package com.xworkz.acapp.impl;

import com.xworkz.acapp.Switch;

public class LGImpl implements Switch {
    @Override
    public void on() {
        System.out.println("AC1 is Turned On");
    }

    @Override
    public void off() {
        System.out.println("AC1 is Turned Off");
    }
}
