package com.xworkz.trafficsignalapp;

import com.xworkz.trafficsignalapp.impl.GreenSignalImpl;
import com.xworkz.trafficsignalapp.impl.RedSignalImpl;
import com.xworkz.trafficsignalapp.impl.YellowSignalImpl;

public class TrafficSignalRunner {
    public static void main(String[] args) {

        Switch signal1 = new RedSignalImpl();
        signal1.on();
        signal1.off();

        Switch signal2 = new YellowSignalImpl();
        signal2.on();
        signal2.off();

        Switch signal3 = new GreenSignalImpl();
        signal3.on();
        signal3.off();
    }
}

