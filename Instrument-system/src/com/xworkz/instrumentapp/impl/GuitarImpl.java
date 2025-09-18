package com.xworkz.instrumentapp.impl;

import com.xworkz.instrumentapp.Instrument;

public class GuitarImpl implements Instrument {

    @Override
    public void on() {
        System.out.println("Guitar is plugged in. Strings are ready to play.");
    }

    @Override
    public void off() {
        System.out.println("Guitar is unplugged. Strings are silent.");
    }
}
