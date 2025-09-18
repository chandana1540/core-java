package com.xworkz.streetlightapp;

import com.xworkz.streetlightapp.impl.FluorescentStreetLightImpl;
import com.xworkz.streetlightapp.impl.LedStreetLightImpl;
import com.xworkz.streetlightapp.impl.SodiumStreetLightImpl;

public class StreetLightRunner {
    public static void main(String[] args) {

        Switch light1 = new LedStreetLightImpl();
        light1.on();
        light1.off();

        Switch light2 = new SodiumStreetLightImpl();
        light2.on();
        light2.off();

        Switch light3 = new FluorescentStreetLightImpl();
        light3.on();
        light3.off();
    }
}

