package com.xworkz.computerapp.impl;

import com.xworkz.computerapp.Switch;

public class DesktopComputerImpl implements Switch {

    @Override
    public void on() {
        System.out.println("Desktop Computer is switched ON.");
    }

    @Override
    public void off() {
        System.out.println("Desktop Computer is switched OFF.");
    }
}
