package com.xworkz.entertainmentapp.impl;

import com.xworkz.entertainmentapp.EntertainmentDevice;

public class RadioImpl implements EntertainmentDevice {

    @Override
    public void on() {
        System.out.println("Radio is turned ON. Playing FM channels.");
    }

    @Override
    public void off() {
        System.out.println("Radio is turned OFF. No sound.");
    }
}
