package com.xworkz.smartwatch.impl;

import com.xworkz.smartwatch.Smartwatch;

public class FitbitImpl implements Smartwatch {

    @Override
    public void on() {
        System.out.println("Fitbit is ON. Tracking steps and activity.");
    }

    @Override
    public void off() {
        System.out.println("Fitbit is OFF. Activity tracking paused.");
    }
}
