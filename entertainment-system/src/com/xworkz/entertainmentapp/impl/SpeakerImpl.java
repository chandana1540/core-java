package com.xworkz.entertainmentapp.impl;

import com.xworkz.entertainmentapp.EntertainmentDevice;

public class SpeakerImpl implements EntertainmentDevice {

    @Override
    public void on() {
        System.out.println("Speaker is powered ON. Music is blasting!");
    }

    @Override
    public void off() {
        System.out.println("Speaker is powered OFF. Silence.");
    }
}
