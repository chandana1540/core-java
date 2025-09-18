package com.xworkz.smartwatch.impl;
import com.xworkz.smartwatch.Smartwatch;

public class SamsungWatchImpl implements Smartwatch {

    @Override
    public void on() {
        System.out.println("Samsung Watch is ON. Heart rate monitoring started.");
    }

    @Override
    public void off() {
        System.out.println("Samsung Watch is OFF. Monitoring stopped.");
    }
}
