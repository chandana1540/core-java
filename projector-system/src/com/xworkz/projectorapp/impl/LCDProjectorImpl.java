package com.xworkz.projectorapp.impl;

import com.xworkz.projectorapp.Switch;

public class LCDProjectorImpl implements Switch {

    @Override
    public void on() {
        System.out.println("LCD Projector is switched ON. Displaying clear images.");
    }

    @Override
    public void off() {
        System.out.println("LCD Projector is switched OFF. Display stopped.");
    }
}


