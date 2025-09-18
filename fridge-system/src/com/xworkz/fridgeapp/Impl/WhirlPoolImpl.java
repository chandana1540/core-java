package com.xworkz.fridgeapp.Impl;

import com.xworkz.fridgeapp.Switch;

public class WhirlPoolImpl implements Switch {
    @Override
    public void on() {
        System.out.println("The fridge2 is Switched On");
    }

    @Override
    public void off() {
        System.out.println("The fridge2 is Switched On");
    }
}
