package com.xworkz.gamingconsoleapp.impl;

import com.xworkz.gamingconsoleapp.Switch;

public class XboxImpl implements Switch {

    @Override
    public void on() {
        System.out.println("Xbox is powered ON. Welcome to the gaming world.");
    }

    @Override
    public void off() {
        System.out.println("Xbox is powered OFF. System is shutting down.");
    }
}


