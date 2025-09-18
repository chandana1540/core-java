package com.xworkz.projectorapp.impl;

import com.xworkz.projectorapp.Switch;

public class LaserProjectorImpl implements Switch {

    @Override
    public void on() {
        System.out.println("Laser Projector is switched ON. Bright laser projection active.");
    }

    @Override
    public void off() {
        System.out.println("Laser Projector is switched OFF. Laser turned off.");
    }
}


