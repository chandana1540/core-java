package com.xworkz.projectorapp.impl;

import com.xworkz.projectorapp.Switch;

public class DLPProjectorImpl implements Switch {

    @Override
    public void on() {
        System.out.println("DLP Projector is switched ON. High-resolution projection started.");
    }

    @Override
    public void off() {
        System.out.println("DLP Projector is switched OFF. Projection stopped.");
    }
}
