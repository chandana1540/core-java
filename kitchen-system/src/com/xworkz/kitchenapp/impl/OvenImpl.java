package com.xworkz.kitchenapp.impl;

import com.xworkz.kitchenapp.KitchenItem;

public class OvenImpl implements KitchenItem {

    @Override
    public void on() {
        System.out.println("Oven is switched ON. Baking started.");
    }

    @Override
    public void off() {
        System.out.println("Oven is switched OFF. Baking stopped.");
    }
}
