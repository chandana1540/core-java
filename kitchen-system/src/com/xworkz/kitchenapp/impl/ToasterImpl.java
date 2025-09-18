package com.xworkz.kitchenapp.impl;

import com.xworkz.kitchenapp.KitchenItem;

public class ToasterImpl implements KitchenItem {

    @Override
    public void on() {
        System.out.println("Toaster is switched ON. Toasting bread...");
    }

    @Override
    public void off() {
        System.out.println("Toaster is switched OFF. Toasting completed.");
    }
}
