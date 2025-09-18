package com.xworkz.acapp.impl;

import com.xworkz.acapp.Switch;

public class SonyImpl implements Switch {
    @Override
    public void on() {
        System.out.println("AC3 is Turned On");
    }

    @Override
    public void off() {
        System.out.println("AC3 is Turned On");
    }
}
