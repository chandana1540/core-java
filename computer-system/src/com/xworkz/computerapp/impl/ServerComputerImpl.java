package com.xworkz.computerapp.impl;

import com.xworkz.computerapp.Switch;

public class ServerComputerImpl implements Switch {

    @Override
    public void on() {
        System.out.println("Server Computer is switched ON.");
    }

    @Override
    public void off() {
        System.out.println("Server Computer is switched OFF.");
    }
}

