package com.xworkz.gamingconsoleapp.impl;

import com.xworkz.gamingconsoleapp.Switch;

public class PlayStationImpl implements Switch {

    @Override
    public void on() {
        System.out.println("PlayStation is powered ON. Ready for gaming.");
    }

    @Override
    public void off() {
        System.out.println("PlayStation is powered OFF. Shutting down system.");
    }
}
