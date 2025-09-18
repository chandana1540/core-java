package com.xworkz.headlightapp;

import com.xworkz.headlightapp.impl.HalogenHeadlightImpl;
import com.xworkz.headlightapp.impl.LEDHeadlightImpl;
import com.xworkz.headlightapp.impl.XenonHeadlightImpl;

public class HeadlightRunner {
    public static void main(String[] args) {

        Switch headlight1 = new HalogenHeadlightImpl();
        headlight1.on();
        headlight1.off();

        Switch headlight2 = new LEDHeadlightImpl();
        headlight2.on();
        headlight2.off();

        Switch headlight3 = new XenonHeadlightImpl();
        headlight3.on();
        headlight3.off();
    }
}

