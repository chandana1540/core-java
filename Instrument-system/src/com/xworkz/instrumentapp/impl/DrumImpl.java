package com.xworkz.instrumentapp.impl;

import com.xworkz.instrumentapp.Instrument;

public class DrumImpl implements Instrument {

    @Override
    public void on() {
        System.out.println("Drumsticks are ready. Beat the drums!");
    }

    @Override
    public void off() {
        System.out.println("Drumsticks kept aside. Drums are silent.");
    }
}
