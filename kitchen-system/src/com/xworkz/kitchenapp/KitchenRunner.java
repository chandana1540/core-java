package com.xworkz.kitchenapp;

import com.xworkz.kitchenapp.impl.MixerImpl;
import com.xworkz.kitchenapp.impl.OvenImpl;
import com.xworkz.kitchenapp.impl.ToasterImpl;

public class KitchenRunner {
    public static void main(String[] args) {

        KitchenItem mixer = new MixerImpl();
        mixer.on();
        mixer.off();

        KitchenItem oven = new OvenImpl();
        oven.on();
        oven.off();

        KitchenItem toaster = new ToasterImpl();
        toaster.on();
        toaster.off();
    }
}
