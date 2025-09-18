package com.xworkz.fridgeapp.Impl;

import com.xworkz.fridgeapp.Switch;

public class HairImpl implements Switch {
    @Override
    public void on() {
        System.out.println("The fridge is Switched On");
    }

    @Override
    public void off() {
        System.out.println("The fridge is Switched Off");
    }
}
