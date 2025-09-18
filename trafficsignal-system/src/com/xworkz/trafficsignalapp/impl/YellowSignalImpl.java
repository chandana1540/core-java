package com.xworkz.trafficsignalapp.impl;

import com.xworkz.trafficsignalapp.Switch;

public class YellowSignalImpl implements Switch {

    @Override
    public void on() {
        System.out.println("Yellow Traffic Signal is ON. Prepare to STOP.");
    }

    @Override
    public void off() {
        System.out.println("Yellow Traffic Signal is OFF. Proceed with caution.");
    }
}
