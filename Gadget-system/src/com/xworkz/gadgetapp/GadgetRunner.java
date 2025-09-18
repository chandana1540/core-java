package com.xworkz.gadgetapp;

import com.xworkz.gadgetapp.impl.LaptopImpl;
import com.xworkz.gadgetapp.impl.MobileImpl;
import com.xworkz.gadgetapp.impl.TVImpl;

public class GadgetRunner {
    public static void main(String[] args) {

        Gadget mobile = new MobileImpl();
        mobile.on();
        mobile.off();

        Gadget laptop = new LaptopImpl();
        laptop.on();
        laptop.off();

        Gadget tv = new TVImpl();
        tv.on();
        tv.off();
    }
}

