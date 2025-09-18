package com.xworkz.instrumentapp;

import com.xworkz.instrumentapp.impl.DrumImpl;
import com.xworkz.instrumentapp.impl.GuitarImpl;
import com.xworkz.instrumentapp.impl.PianoImpl;

public class InstrumentRunner {
    public static void main(String[] args) {

        Instrument guitar = new GuitarImpl();
        guitar.on();
        guitar.off();

        Instrument piano = new PianoImpl();
        piano.on();
        piano.off();

        Instrument drum = new DrumImpl();
        drum.on();
        drum.off();
    }
}

