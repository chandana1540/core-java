package com.xworkz.kitchenapp.impl;

import com.xworkz.kitchenapp.KitchenItem;

public class MixerImpl implements KitchenItem {

    @Override
    public void on() {
        System.out.println("Mixer is switched ON. Grinding ingredients...");
    }

    @Override
    public void off() {
        System.out.println("Mixer is switched OFF. Grinding stopped.");
    }
}
