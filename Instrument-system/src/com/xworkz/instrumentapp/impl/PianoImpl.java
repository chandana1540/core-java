package com.xworkz.instrumentapp.impl;

import com.xworkz.instrumentapp.Instrument;

public class PianoImpl implements Instrument {

    @Override
    public void on() {
        System.out.println("Piano is opened. Keys are ready to play.");
    }

    @Override
    public void off() {
        System.out.println("Piano is closed. Keys are silent.");
    }
}
