package com.xworkz.fridgeapp.Impl;

import com.xworkz.fridgeapp.Switch;

public class SamsungImpl implements Switch {
    @Override
    public void on() {
        System.out.println("The fridge1 is Switched On");
    }

    @Override
    public void off() {
        System.out.println("The fridge1 is Switched Off");

    }
}
