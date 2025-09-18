package com.xworkz.smartwatch.impl;

import com.xworkz.smartwatch.Smartwatch;

public class AppleWatchImpl implements Smartwatch {

    @Override
    public void on() {
        System.out.println("Apple Watch is ON. Displaying notifications.");
    }

    @Override
    public void off() {
        System.out.println("Apple Watch is OFF. Screen is dark.");
    }
}
